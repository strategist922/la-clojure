package org.jetbrains.plugins.clojure.psi.impl;

import org.jetbrains.plugins.clojure.psi.ClojurePsiElementImpl;
import com.intellij.lang.ASTNode;

/**
 * @author ilyas
*/
public class ClAt extends ClojurePsiElementImpl {
  public ClAt(ASTNode node) {
    super(node);
  }
}
