package net.runelite.injector.raw;

import net.runelite.asm.Method;
import net.runelite.asm.attributes.code.Instruction;
import net.runelite.asm.attributes.code.Instructions;
import net.runelite.asm.attributes.code.instruction.types.PushConstantInstruction;
import net.runelite.asm.attributes.code.instructions.ILoad;
import net.runelite.asm.attributes.code.instructions.InvokeStatic;
import net.runelite.asm.execution.Execution;
import net.runelite.asm.execution.InstructionContext;
import net.runelite.asm.execution.MethodContext;
import net.runelite.asm.execution.StackContext;
import net.runelite.asm.pool.Class;
import net.runelite.asm.signature.Signature;
import net.runelite.injector.Inject;
import net.runelite.injector.InjectUtil;
import net.runelite.injector.InjectionException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

public class ClearColorBuffer
{
	private static final Logger log = LoggerFactory.getLogger(ClearColorBuffer.class);
	private static final net.runelite.asm.pool.Method CLEAR_BUFFER = new net.runelite.asm.pool.Method(
			new Class("net.runelite.client.callback.Hooks"),
			"clearColorBuffer",
			new Signature("(IIIII)V")
	);
	private final Inject inject;

	public ClearColorBuffer(Inject inject)
	{
		this.inject = inject;
	}

	public void inject() throws InjectionException
	{
		/*
		 * This class stops the client from basically painting everything black before the scene is drawn
		 */
		final Execution execution = new Execution(inject.getVanilla());

		final net.runelite.asm.pool.Method fillRectPool = InjectUtil.findMethod(inject, "Rasterizer2D_fillRectangle", "Rasterizer2D").getPoolMethod();
		final Method drawEntities = InjectUtil.findMethod(inject, "drawEntities"); // XXX: should prob be called drawViewport?

		execution.addMethod(drawEntities);
		execution.noInvoke = true;

		final AtomicReference<MethodContext> pcontext = new AtomicReference<>(null);

		execution.addMethodContextVisitor(pcontext::set);
		execution.run();

		final MethodContext methodContext = pcontext.get();
		for (InstructionContext ic : methodContext.getInstructionContexts())
		{
			final Instruction instr = ic.getInstruction();
			if (!(instr instanceof InvokeStatic))
			{
				continue;
			}

			if (fillRectPool.equals(((InvokeStatic) instr).getMethod()))
			{
				List<StackContext> pops = ic.getPops();

				// Last pop is constant value 0, before that are vars in order
				assert pops.size() == 5 : "If this fails cause of this add in 1 for obfuscation, I don't think that happens here though";

				int i = 0;
				Instruction pushed = pops.get(i++).getPushed().getInstruction();
				assert (pushed instanceof PushConstantInstruction) && ((PushConstantInstruction) pushed).getConstant().equals(0);

				for (int varI = 3; i < 5; i++, varI--)
				{
					pushed = pops.get(i).getPushed().getInstruction();
					assert (pushed instanceof ILoad) && ((ILoad) pushed).getVariableIndex() == varI;
				}

				Instructions ins = instr.getInstructions();
				ins.replace(instr, new InvokeStatic(ins, CLEAR_BUFFER));
				log.debug("Injected drawRectangle at {}", methodContext.getMethod().getPoolMethod());
			}
		}
	}
}