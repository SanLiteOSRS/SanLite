/*
 * Copyright (c) 2019, Lucas <https://github.com/Lucwousin>
 * All rights reserved.
 *
 * This code is licensed under GPL3, see the complete license in
 * the LICENSE file in the root directory of this submodule.
 */
package net.runelite.injector.injectors.raw;

import lombok.extern.slf4j.Slf4j;
import net.runelite.injector.InjectException;
import net.runelite.injector.InjectUtil;
import net.runelite.injector.injection.InjectData;
import net.runelite.injector.injectors.AbstractInjector;
import java.util.ListIterator;
import net.runelite.asm.Method;
import net.runelite.asm.attributes.code.Instruction;
import net.runelite.asm.attributes.code.Instructions;
import net.runelite.asm.attributes.code.instructions.InvokeStatic;
import net.runelite.asm.attributes.code.instructions.InvokeVirtual;
import net.runelite.asm.pool.Class;
import net.runelite.asm.signature.Signature;
import static net.runelite.injector.injection.InjectData.HOOKS;

@Slf4j
public class RenderDraw extends AbstractInjector
{
	private static final net.runelite.asm.pool.Method RENDER_DRAW = new net.runelite.asm.pool.Method(
		new Class(HOOKS),
		"renderDraw",
		new Signature("(Lnet/runelite/api/Renderable;IIIIIIIIJ)V")
	);
	private static final int EXPECTED_METHOD_CALLS = 21;

	public RenderDraw(InjectData inject)
	{
		super(inject);
	}

	@Override
	public void inject()
	{
		int replaced = 0;

		/*
		 * This class replaces entity draw invocation instructions
		 * with the renderDraw method on drawcallbacks
		 */
		final net.runelite.asm.pool.Method draw = InjectUtil.findMethod(inject, "draw", "Renderable", null, true, false).getPoolMethod();

		final Method drawTile = InjectUtil.findMethod(inject, "drawTile", "Scene", null, true, false);

		Instructions ins = drawTile.getCode().getInstructions();
		for (ListIterator<Instruction> iterator = ins.listIterator(); iterator.hasNext(); )
		{
			Instruction i = iterator.next();
			if (i instanceof InvokeVirtual)
			{
				if (((InvokeVirtual) i).getMethod().equals(draw))
				{
					iterator.set(new InvokeStatic(ins, RENDER_DRAW));
					log.debug("[DEBUG] Replaced method call at {}", i);
					++replaced;
				}
			}
		}

		if (replaced != EXPECTED_METHOD_CALLS)
		{
			throw new InjectException("Didn't replace the expected amount of method calls");
		}
	}
}
