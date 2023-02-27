const readline = require('readline');
const chalk = require('chalk');
const fs = require('fs');
const path = require('path');

const rl = readline.createInterface({
  input: process.stdin,
  output: process.stdout,
});

rl.question(chalk.blue(''), (input) => {
  const isValid = /^mit\s+(list|hash|zlib)\s+([~\w\s/\\:\*\?"<>\|]+)$/.test(
    input
  );
  if (!isValid) {
    console.log(chalk.red('Invalid input'));
    rl.close();
    return;
  }
  const [mit, command, directory] = input.split(' ');

  switch (command) {
    case 'list':
      listFiles(directory);
    case 'hash':
    case 'zlib':
  }

  rl.close();
});

function listFiles(directory) {
  fs.readdir(directory, (err, files) => {
    if (err) {
      console.log(chalk.red(err.message));
      return;
    }

    files.forEach((file) => {
      const filePath = path.join(directory, file);
      fs.stat(filePath, (err, stat) => {
        if (err) {
          console.log(chalk.red(err.message));
          return;
        }

        const fileSizeInKiloBytes = (stat.size / 1024).toFixed(2);

        if (stat.isDirectory()) {
          console.log(chalk.green(`${file + '/'} ${fileSizeInKiloBytes}KB`));
          return;
        }

        console.log(chalk.green(`${file} ${fileSizeInKiloBytes}KB`));
      });
    });
  });
}
