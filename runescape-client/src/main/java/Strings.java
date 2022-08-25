import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("kg")
@Implements("Strings")
public class Strings {
	@ObfuscatedName("cs")
	public static String field3742;
	@ObfuscatedName("ei")
	public static String field3746;
	@ObfuscatedName("kn")
	public static String field3894;
	@ObfuscatedName("kj")
	public static String field3687;
	@ObfuscatedName("ki")
	public static String field3762;

	static {
		field3742 = "Please visit the support page for assistance."; // L: 99
		field3746 = "Please visit the support page for assistance."; // L: 136
		field3894 = ""; // L: 299
		field3687 = "Page has opened in a new window."; // L: 300
		field3762 = "(Please check your popup blocker.)"; // L: 301
	} // L: 342

	@ObfuscatedName("bq")
	@ObfuscatedSignature(
		descriptor = "(ILbz;ZI)I",
		garbageValue = "1995278317"
	)
	static int method5685(int var0, Script var1, boolean var2) {
		if (var0 == 7100) { // L: 4616
			++Nameable.Interpreter_intStackSize; // L: 4617
			return 1; // L: 4618
		} else if (var0 == 7101) { // L: 4620
			UserComparator8.Interpreter_stringStackSize += 2; // L: 4621
			return 1; // L: 4622
		} else if (var0 != 7102 && var0 != 7103 && var0 != 7104 && var0 != 7105 && var0 != 7109) { // L: 4624
			if (var0 == 7106) { // L: 4628
				++Nameable.Interpreter_intStackSize; // L: 4629
				return 1; // L: 4630
			} else if (var0 == 7107) { // L: 4632
				++Nameable.Interpreter_intStackSize; // L: 4633
				return 1; // L: 4634
			} else if (var0 == 7108) { // L: 4636
				Interpreter.Interpreter_intStack[++Nameable.Interpreter_intStackSize - 1] = TaskHandler.method3190() ? 1 : 0; // L: 4637
				return 1; // L: 4638
			} else if (var0 == 7110) { // L: 4640
				Interpreter.Interpreter_intStack[++Nameable.Interpreter_intStackSize - 1] = 0; // L: 4641
				return 1; // L: 4642
			} else if (var0 == 7120) { // L: 4644
				--Nameable.Interpreter_intStackSize; // L: 4645
				Interpreter.Interpreter_intStack[++Nameable.Interpreter_intStackSize - 1] = 0; // L: 4646
				return 1; // L: 4647
			} else if (var0 == 7121) { // L: 4649
				Nameable.Interpreter_intStackSize -= 2; // L: 4650
				Interpreter.Interpreter_intStack[++Nameable.Interpreter_intStackSize - 1] = -1; // L: 4651
				return 1; // L: 4652
			} else if (var0 == 7122) { // L: 4654
				Nameable.Interpreter_intStackSize -= 2; // L: 4655
				Interpreter.Interpreter_intStack[++Nameable.Interpreter_intStackSize - 1] = 0; // L: 4656
				return 1; // L: 4657
			} else {
				return 2; // L: 4659
			}
		} else {
			++Nameable.Interpreter_intStackSize; // L: 4625
			return 1; // L: 4626
		}
	}

	@ObfuscatedName("fx")
	@ObfuscatedSignature(
		descriptor = "(Lcq;III)V",
		garbageValue = "-624973350"
	)
	@Export("performPlayerAnimation")
	static void performPlayerAnimation(Player var0, int var1, int var2) {
		if (var0.sequence == var1 && var1 != -1) { // L: 4301
			int var3 = ByteArrayPool.SequenceDefinition_get(var1).field2181; // L: 4302
			if (var3 == 1) { // L: 4303
				var0.sequenceFrame = 0; // L: 4304
				var0.sequenceFrameCycle = 0; // L: 4305
				var0.sequenceDelay = var2; // L: 4306
				var0.field1172 = 0; // L: 4307
			}

			if (var3 == 2) { // L: 4309
				var0.field1172 = 0; // L: 4310
			}
		} else if (var1 == -1 || var0.sequence == -1 || ByteArrayPool.SequenceDefinition_get(var1).field2157 >= ByteArrayPool.SequenceDefinition_get(var0.sequence).field2157) { // L: 4313
			var0.sequence = var1; // L: 4314
			var0.sequenceFrame = 0; // L: 4315
			var0.sequenceFrameCycle = 0; // L: 4316
			var0.sequenceDelay = var2; // L: 4317
			var0.field1172 = 0; // L: 4318
			var0.field1201 = var0.pathLength; // L: 4319
		}

	} // L: 4321
}
