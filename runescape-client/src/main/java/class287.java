import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("lm")
public class class287 {
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Llm;"
	)
	public static final class287 field3206;
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Llm;"
	)
	public static final class287 field3197;
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Llm;"
	)
	public static final class287 field3201;
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Llm;"
	)
	public static final class287 field3199;
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "Llm;"
	)
	public static final class287 field3200;
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Llm;"
	)
	public static final class287 field3202;
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Llm;"
	)
	public static final class287 field3208;
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Llm;"
	)
	public static final class287 field3203;
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Llm;"
	)
	public static final class287 field3204;
	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "Llm;"
	)
	public static final class287 field3205;
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Llm;"
	)
	public static final class287 field3196;

	static {
		field3206 = new class287(2); // L: 5
		field3197 = new class287(14); // L: 6
		field3201 = new class287(6); // L: 7
		field3199 = new class287(4); // L: 8
		field3200 = new class287(16); // L: 9
		field3202 = new class287(5); // L: 10
		field3208 = new class287(5); // L: 11
		field3203 = new class287(4); // L: 12
		field3204 = new class287(7); // L: 13
		field3205 = new class287(14); // L: 14
		field3196 = new class287(11); // L: 15
	}

	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "2"
	)
	class287(int var1) {
	} // L: 21

	@ObfuscatedName("hk")
	@ObfuscatedSignature(
		descriptor = "(Lha;IIII)V",
		garbageValue = "-1566363123"
	)
	static void method5696(SequenceDefinition var0, int var1, int var2, int var3) {
		if (Client.soundEffectCount < 50 && class20.clientPreferences.method2465() != 0) { // L: 3480
			if (var0.soundEffects != null && var1 < var0.soundEffects.length) { // L: 3481
				class161.method3447(var0.soundEffects[var1], var2, var3); // L: 3482
			}
		}
	} // L: 3483

	@ObfuscatedName("mv")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "-87"
	)
	static void method5689(int var0) {
		Language.tempMenuAction = new MenuAction(); // L: 11522
		Language.tempMenuAction.param0 = Client.menuArguments1[var0]; // L: 11523
		Language.tempMenuAction.param1 = Client.menuArguments2[var0]; // L: 11524
		Language.tempMenuAction.opcode = Client.menuOpcodes[var0]; // L: 11525
		Language.tempMenuAction.identifier = Client.menuIdentifiers[var0]; // L: 11526
		Language.tempMenuAction.field875 = Client.field637[var0]; // L: 11527
		Language.tempMenuAction.field880 = Client.menuActions[var0]; // L: 11528
		Language.tempMenuAction.field882 = Client.menuTargets[var0]; // L: 11529
	} // L: 11530

	@ObfuscatedName("mj")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "1669002823"
	)
	@Export("Widget_resetModelFrames")
	static final void Widget_resetModelFrames(int var0) {
		if (SoundSystem.loadInterface(var0)) { // L: 11565
			Widget[] var1 = VerticalAlignment.Widget_interfaceComponents[var0]; // L: 11566

			for (int var2 = 0; var2 < var1.length; ++var2) { // L: 11567
				Widget var3 = var1[var2]; // L: 11568
				if (var3 != null) { // L: 11569
					var3.modelFrame = 0; // L: 11570
					var3.modelFrameCycle = 0; // L: 11571
				}
			}

		}
	} // L: 11573
}
