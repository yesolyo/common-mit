import SwiftSyntax

class SwiftSyntaxHighlighter: SyntaxRewriter {
    var html: String = ""

    override func visit(_ token: TokenSyntax) -> Syntax {
        switch token.tokenKind {
        // ...
        case .floatingLiteral(let string):
            html += "<span class=\"mf\">\(string)</span>"
        case .integerLiteral(let string):
            if string.hasPrefix("0b") {
                html += "<span class=\"mb\">\(string)</span>"
            } else if string.hasPrefix("0o") {
                html += "<span class=\"mo\">\(string)</span>"
            } else if string.hasPrefix("0x") {
                html += "<span class=\"mh\">\(string)</span>"
            } else {
                html += "<span class=\"mi\">\(string)</span>"
            }
        // ...
        default:
            break
        }

        return token
    }
}
