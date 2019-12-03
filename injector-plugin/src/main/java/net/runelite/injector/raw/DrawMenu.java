/*
 * Copyright (c) 2019, Lucas <https://github.com/Lucwousin>
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are met:
 *
 * 1. Redistributions of source code must retain the above copyright notice, this
 *    list of conditions and the following disclaimer.
 * 2. Redistributions in binary form must reproduce the above copyright notice,
 *    this list of conditions and the following disclaimer in the documentation
 *    and/or other materials provided with the distribution.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" AND
 * ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED
 * WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE
 * DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT OWNER OR CONTRIBUTORS BE LIABLE FOR
 * ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES
 * (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES;
 * LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND
 * ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT
 * (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS
 * SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */
package net.runelite.injector.raw;

import net.runelite.asm.Method;
import net.runelite.asm.attributes.code.Instruction;
import net.runelite.asm.attributes.code.Instructions;
import net.runelite.asm.attributes.code.Label;
import net.runelite.asm.attributes.code.instructions.GetStatic;
import net.runelite.asm.attributes.code.instructions.IfEq;
import net.runelite.asm.attributes.code.instructions.IfNe;
import net.runelite.asm.attributes.code.instructions.InvokeStatic;
import net.runelite.asm.execution.Execution;
import net.runelite.asm.execution.InstructionContext;
import net.runelite.asm.execution.MethodContext;
import net.runelite.asm.pool.Class;
import net.runelite.asm.pool.Field;
import net.runelite.asm.signature.Signature;
import net.runelite.injector.Inject;
import net.runelite.injector.InjectUtil;
import net.runelite.injector.InjectionException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

public class DrawMenu
{
	private final Logger log = LoggerFactory.getLogger(DrawMenu.class);
	private final Inject inject;
	private static final net.runelite.asm.pool.Method DRAW_MENU = new net.runelite.asm.pool.Method(
			new Class("net.runelite.client.callback.Hooks"),
			"drawMenu",
			new Signature("()Z")
	);

	public DrawMenu(Inject inject)
	{
		this.inject = inject;
	}

	public void inject() throws InjectionException
	{
		/*
		 * The drawMenu method can be inlined, so we need this raw injector to find where to inject.
		 *
		 * Originally I wanted to make sure we don't skip the method where client gets told not to draw
		 * the widgets behind the menu. This would be useless though, as the client redraws the widgets
		 * no matter what. It would also be such a insignificant performance boost it doesn't seem worth
		 * the extra headache to me.
		 *
		 * --- what the code looks like completely un-inlined ---
		 * if (!isMenuOpen) {
		 *    if (viewportX != -1) {
		 *       drawTopLeftText(viewportX, viewportY);
		 *    }
		 * } else {
		 *    drawMenu();
		 * }
		 *
		 * if (gameDrawingMode == 3) {
		 *    ...
		 * --------
		 */

		final Method drawLoggedIn = InjectUtil.findMethod(inject, "drawLoggedIn", "Client");
		final Field gameDrawMode = InjectUtil.findDeobField(inject, "gameDrawingMode", "Client").getPoolField();
		final Field isMenuOpen = InjectUtil.findDeobField(inject, "isMenuOpen", "Client").getPoolField();

		final Execution execution = new Execution(inject.getVanilla());
		execution.noInvoke = true;
		execution.addMethod(drawLoggedIn);

		AtomicReference<MethodContext> mcRef = new AtomicReference<>(null);

		execution.addMethodContextVisitor(mcRef::set);
		execution.run();

		Instruction injectInvokeAfter = null;
		Label labelToJumpTo = null;

		MethodContext mc = mcRef.get();
		for (InstructionContext ic : mc.getInstructionContexts())
		{
			Instruction instruction = ic.getInstruction();
			if (!(instruction instanceof GetStatic))
				continue;

			if (((GetStatic) instruction).getField().equals(isMenuOpen))
			{
				InstructionContext isMenuOpenPopper = ic.getPushes().get(0).getPopped().get(0);
				Instruction isMenuOpenPopI = isMenuOpenPopper.getInstruction();

				// Unless there's a isMenuOpen in drawLoggedIn I missed (or something new got inlined (and I missed that)) this should never happen
				assert isMenuOpenPopI instanceof IfEq || isMenuOpenPopI instanceof IfNe : "isMenuOpen was popped by a " + isMenuOpenPopI + "?";

				// If the popper is a IfNe the label it's pointing to is the drawMenu one and topLeft is directly after it
				// else it's the other way around, obviously
				if (isMenuOpenPopI instanceof IfNe)
					injectInvokeAfter = ((IfNe) isMenuOpenPopI).getTo();
				else
					injectInvokeAfter = isMenuOpenPopI;
			}
			else if (((GetStatic) instruction).getField().equals(gameDrawMode))
			{
				List<Instruction> instrL = instruction.getInstructions().getInstructions();
				for (int i = instrL.indexOf(instruction); !(instruction instanceof Label); i--)
					instruction = instrL.get(i);

				labelToJumpTo = (Label) instruction;
			}

			if (injectInvokeAfter != null && labelToJumpTo != null)
				break;
		}

		if (injectInvokeAfter == null || labelToJumpTo == null)
			throw new InjectionException("Could not find the right location for DrawMenu to inject");

		final Instructions instructions = mc.getMethod().getCode().getInstructions();
		int idx = instructions.getInstructions().indexOf(injectInvokeAfter);

		instructions.addInstruction(++idx, new InvokeStatic(instructions, DRAW_MENU));
		instructions.addInstruction(++idx, new IfNe(instructions, labelToJumpTo));

		log.info("DrawMenu injected a method call at index {} in method {}. Comparison jumping to {}", idx, drawLoggedIn, labelToJumpTo);
	}
}