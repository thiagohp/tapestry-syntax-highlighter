tapestry-syntax-highlighter
===========================

Package that integrates the Prism (http://prismjs.com/) syntax highlighter written by
Lea Verou into Apache Tapestry 5.

To use it, just add the JAR in the classpath and add the syntax-highlighter/SyntaxHighlighter mixin
to any component (including the Any one). You can use its enabled parameter to enable or disable 
it using custom logic if needed.

By default, it uses the default theme and adds the Line Highlight plugin. To change this,
create your own version of Prism using the form at http://prismjs.com/download.html and
override the SyntaxHighlighter.DEFAULT_JAVASCRIPT_FILE_PATH and/or 
SyntaxHighlighter.DEFAULT_JAVASCRIPT_FILE_PATH Tapestry-IoC symbols to point to your versions
of these files. 