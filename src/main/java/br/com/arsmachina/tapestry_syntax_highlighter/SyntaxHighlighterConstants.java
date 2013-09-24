// Copyright 2013 Thiago H. de Paula Figueiredo
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
//     http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.
// Copyright 2013 Thiago H. de Paula Figueiredo
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
//     http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.
package br.com.arsmachina.tapestry_syntax_highlighter;


/**
 * Class that defines Tapestry Syntax Highlighter constants.
 * 
 * @author Thiago H. de Paula Figueiredo (http://machina.com.br/thiago)
 */
public class SyntaxHighlighterConstants {

	/**
	 * Symbol that defines whether the syntax highlighting will be enabled or not by default.
	 * Default: <code>true</code>. 
	 */
	public static final String ENABLE_SYMBOL = "tapestry-syntax-highlighter.enable";
	
//	/**
//	 * Symbol that defines whether the syntax highlighting will be added to all pages,
//	 * regardless of having the {@link SyntaxHighlighter} mixin or not.
//	 * Default: <code>false</code>. 
//	 */
//	public static final String GLOBAL_SYMBOL = "tapestry-syntax-highlighter.global";
	
	/**
	 * Symbol that defines where to locate the Prism JavaScript file.
	 * Default: {@link #JAVASCRIPT_FILE_PATH} 
	 */
	public static final String JAVASCRIPT_FILE_PATH_SYMBOL = "tapestry-syntax-highlighter.javascript-file-path";

	/**
	 * Default {@link #JAVASCRIPT_FILE_PATH_SYMBOL} value.
	 * Options:
	 * <ul>
	 * 	<li>Themes: default</li>
	 *  <li>Languages: markup, CSS, CSS extras, C-like, Java</li>
	 *  <li>Plugins: Line Highlight</li>
	 * </ul>
	 */
	public static final String DEFAULT_JAVASCRIPT_FILE_PATH = "classpath:/META-INF/assets/syntax-highlighter/prism.js";

	/**
	 * Symbol that defines where to locate the Prism JavaScript file.
	 * Default: {@link #JAVASCRIPT_FILE_PATH} 
	 */
	public static final String CSS_FILE_PATH_SYMBOL = "tapestry-syntax-highlighter.css-file-path";

	/**
	 * Default {@link #JAVASCRIPT_FILE_PATH_SYMBOL} value.
	 * Options:
	 * <ul>
	 * 	<li>Themes: default</li>
	 *  <li>Languages: markup, CSS, CSS extras, C-like, Java</li>
	 *  <li>Plugins: Line Highlight</li>
	 * </ul>
	 */
	public static final String DEFAULT_CSS_FILE_PATH = "classpath:/META-INF/assets/syntax-highlighter/prism.css";

}
