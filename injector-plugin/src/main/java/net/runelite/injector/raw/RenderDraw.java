package net.runelite.injector.raw;

import net.runelite.asm.attributes.code.Instruction;
import net.runelite.asm.attributes.code.Instructions;
import net.runelite.asm.attributes.code.instructions.InvokeStatic;
import net.runelite.asm.attributes.code.instructions.InvokeVirtual;
import net.runelite.asm.pool.Class;
import net.runelite.asm.signature.Signature;
import net.runelite.injector.Inject;
import net.runelite.injector.InjectUtil;
import net.runelite.injector.InjectionException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ListIterator;

public class RenderDraw
{
	private static final Logger log = LoggerFactory.getLogger(RenderDraw.class);
	private final Inject inject;

	private static final net.runelite.asm.pool.Method RENDER_DRAW = new net.runelite.asm.pool.Method(
			new Class("net.runelite.client.callback.Hooks"),
			"renderDraw",
			new Signature("(Lnet/runelite/api/Renderable;IIIIIIIIJ)V")
	);
	private static final int EXPECTED_METHOD_CALLS = 21;

	public RenderDraw(Inject inject)
	{
		this.inject = inject;
	}

	public void inject() throws InjectionException
	{
		int replaced = 0;

		/*
		 * This class replaces entity draw invocation instructions
		 * with the renderDraw method on draw callbacks
		 */
		final net.runelite.asm.pool.Method draw = InjectUtil.findMethod(inject, "draw", "Renderable").getPoolMethod();
		final net.runelite.asm.Method drawTile = InjectUtil.findMethod(inject, "drawTile", "Scene");

		Instructions instructions = drawTile.getCode().getInstructions();
		for (ListIterator<Instruction> iterator = instructions.getInstructions().listIterator(); iterator.hasNext(); )
		{
			Instruction instruction = iterator.next();
			if (instruction instanceof InvokeVirtual)
			{
				if (((InvokeVirtual) instruction).getMethod().equals(draw))
				{
					iterator.set(new InvokeStatic(instructions, RENDER_DRAW));
					log.debug("Replaced method call at {}", instruction);
					++replaced;
				}
			}
		}

		if (replaced != EXPECTED_METHOD_CALLS)
			throw new InjectionException("[RenderDraw] Did not replace the expected amount of method calls");
	}
}
