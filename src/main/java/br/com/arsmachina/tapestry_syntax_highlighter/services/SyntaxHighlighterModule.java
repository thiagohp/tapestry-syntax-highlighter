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
package br.com.arsmachina.tapestry_syntax_highlighter.services;

import org.apache.tapestry5.ioc.Configuration;
import org.apache.tapestry5.ioc.MappedConfiguration;
import org.apache.tapestry5.ioc.annotations.Contribute;
import org.apache.tapestry5.services.ComponentClassResolver;
import org.apache.tapestry5.services.LibraryMapping;

import br.com.arsmachina.tapestry_syntax_highlighter.SyntaxHighlighterConstants;

/**
 * Tapestry-IoC module class for Tapestry Syntax Highlighter.
 * 
 * @author Thiago H. de Paula Figueiredo (http://machina.com.br/thiago)
 */
public class SyntaxHighlighterModule {
	
	/**
	 * Contributes this module's to Tapestry as a component library (even if it actually doesn't
	 * have any actual components, just one mixin).
	 */
	@Contribute(ComponentClassResolver.class)
	public static void addLibraryMapping(Configuration<LibraryMapping> configuration) {
		configuration.add(new LibraryMapping("syntax-highlighter", "br.com.arsmachina.tapestry_syntax_highlighter"));
	}
	
	/**
	 * Defines some factory defaults based on constants in {@link SyntaxHighlighterConstants}.
	 * 
	 * @param configuration a {@link MappedConfiguration}.
	 */
	public static void contributeFactoryDefaults(MappedConfiguration<String, String> configuration) {
		configuration.add(SyntaxHighlighterConstants.ENABLE_SYMBOL, "true");
		configuration.add(SyntaxHighlighterConstants.JAVASCRIPT_FILE_PATH_SYMBOL, SyntaxHighlighterConstants.DEFAULT_JAVASCRIPT_FILE_PATH);
		configuration.add(SyntaxHighlighterConstants.CSS_FILE_PATH_SYMBOL, SyntaxHighlighterConstants.DEFAULT_CSS_FILE_PATH);
//		configuration.add(SyntaxHighlighterConstants.GLOBAL_SYMBOL, SyntaxHighlighterConstants.DEFAULT_CSS_FILE_PATH);
	}

}
