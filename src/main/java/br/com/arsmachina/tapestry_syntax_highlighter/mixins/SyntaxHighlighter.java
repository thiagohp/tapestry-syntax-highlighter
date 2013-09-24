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
package br.com.arsmachina.tapestry_syntax_highlighter.mixins;

import org.apache.tapestry5.Asset;
import org.apache.tapestry5.annotations.Parameter;
import org.apache.tapestry5.annotations.Path;
import org.apache.tapestry5.ioc.annotations.Inject;
import org.apache.tapestry5.ioc.annotations.Symbol;
import org.apache.tapestry5.services.javascript.JavaScriptSupport;

import br.com.arsmachina.tapestry_syntax_highlighter.SyntaxHighlighterConstants;

/**
 * Mixin that adds the Prism syntax highlighter to the page or component.
 * 
 * @author Thiago H. de Paula Figueiredo (http://machina.com.br/thiago)
 * @see SyntaxHighlighterConstants#ENABLE_SYMBOL
 */
public class SyntaxHighlighter {
	
	/**
	 * Defines whether the addition of the Prism highlighter will actually be done or not.
	 * Default value is defined by the value of the {@link SyntaxHighlighterConstants#ENABLE_SYMBOL}
	 * symbol.
	 * 
	 * @see SyntaxHighlighterConstants#ENABLE_SYMBOL
	 */
	@Parameter
	private boolean enable;
	
	@Inject
	@Symbol(SyntaxHighlighterConstants.ENABLE_SYMBOL)
	private boolean defaultEnable;
	
	@Inject
	@Path("${" + SyntaxHighlighterConstants.JAVASCRIPT_FILE_PATH_SYMBOL + "}")
	private Asset javascriptAsset;

	/**
	 * Simple one-liner JS file used to workaround the issue of Prism not automatically starting.
	 */
	@Inject
	@Path("classpath:/META-INF/assets/syntax-highlighter/prism-start-fix.js")
	private Asset startPrismAsset;

	@Inject
	@Path("${" + SyntaxHighlighterConstants.CSS_FILE_PATH_SYMBOL + "}")
	private Asset cssAsset;
	
	@Inject
	private JavaScriptSupport javaScriptSupport;
	
	/**
	 * Adds or not the JavaScript and CSS files.
	 */
	void afterRender() {
		if (enable) {
			javaScriptSupport.importJavaScriptLibrary(javascriptAsset);
			javaScriptSupport.importJavaScriptLibrary(startPrismAsset);
			javaScriptSupport.importStylesheet(cssAsset);
		}
	}

	/**
	 * Defines the default value for the <code>enabled</code> parameter.
	 * @return a <code>boolean</code>.
	 */
	boolean defaultEnabled() {
		return defaultEnable;
	}

}
