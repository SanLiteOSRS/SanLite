package net.runelite.injector.raw;

import net.runelite.asm.Method;
import net.runelite.asm.attributes.Code;
import net.runelite.asm.attributes.code.Instruction;
import net.runelite.asm.attributes.code.Instructions;
import net.runelite.asm.attributes.code.instructions.BiPush;
import net.runelite.injector.Inject;
import net.runelite.injector.InjectUtil;
import net.runelite.injector.InjectionException;

import java.util.ListIterator;

public class Occluder
{
	private final Inject inject;
	private static final byte OLD_VALUE = 25;
	private static final byte NEW_VALUE = 90;

	public Occluder(Inject inject)
	{
		this.inject = inject;
	}

	public void inject() throws InjectionException
	{
		/*
		 * This class changes the max view distance length, higher than this is useless though
		 */

		Method occlude = InjectUtil.findMethod(inject, "occlude", "Scene");

		int replaced = 0;

		final Code code = occlude.getCode();
		final Instructions instructions = code.getInstructions();
		final ListIterator<Instruction> it = instructions.getInstructions().listIterator();

		while (it.hasNext())
		{
			Instruction i = it.next();

			if (!(i instanceof BiPush))
				continue;

			boolean shouldChange = (byte) ((BiPush) i).getConstant() == OLD_VALUE;

			if (!shouldChange)
				continue;

			replaced++;

			Instruction biPush = new BiPush(instructions, NEW_VALUE);

			it.set(biPush);
		}

		if (replaced != 10)
			throw new InjectionException("[Occluder] Only found " + replaced + " 25's to replace in occlude instead of expected 10");
	}
}
