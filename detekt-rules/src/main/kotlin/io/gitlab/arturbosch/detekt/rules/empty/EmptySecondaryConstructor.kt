package io.gitlab.arturbosch.detekt.rules.empty

import io.gitlab.arturbosch.detekt.api.Config
import org.jetbrains.kotlin.psi.KtSecondaryConstructor

/**
 * @active since v1.0.0
 * @author schalkms
 * @author Marvin Ramin
 */
class EmptySecondaryConstructor(config: Config) : EmptyRule(config) {

	override fun visitSecondaryConstructor(constructor: KtSecondaryConstructor) {
		constructor.bodyExpression?.addFindingIfBlockExprIsEmpty()
	}
}
