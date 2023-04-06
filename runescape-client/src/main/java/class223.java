import java.awt.Component;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ie")
public class class223 {
	@ObfuscatedName("fn")
	@ObfuscatedSignature(
		descriptor = "Lmx;"
	)
	static Archive field2581;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = 532233349
	)
	int field2579;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = -2038217369
	)
	int field2577;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = -2099700903
	)
	int field2578;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = -1231347425
	)
	int field2585;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = 1061110137
	)
	int field2580;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = -290660215
	)
	int field2576;

	class223(int var1, int var2, int var3, int var4, int var5, int var6) {
		this.field2579 = var1; // L: 12
		this.field2577 = var2; // L: 13
		this.field2578 = var3; // L: 14
		this.field2585 = var4; // L: 15
		this.field2580 = var5;
		this.field2576 = var6;
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(Ljava/awt/Component;I)V",
		garbageValue = "-984780725"
	)
	static void method4546(Component var0) {
		var0.addMouseListener(MouseHandler.KeyHandler_instance); // L: 37
		var0.addMouseMotionListener(MouseHandler.KeyHandler_instance); // L: 38
		var0.addFocusListener(MouseHandler.KeyHandler_instance); // L: 39
	} // L: 40

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(Lsy;Lrz;I)Lrz;",
		garbageValue = "1598994640"
	)
	@Export("readStringIntParameters")
	static final IterableNodeHashTable readStringIntParameters(Buffer var0, IterableNodeHashTable var1) {
		int var2 = var0.readUnsignedByte(); // L: 16
		int var3;
		if (var1 == null) { // L: 17
			var3 = WorldMapLabelSize.method4793(var2); // L: 18
			var1 = new IterableNodeHashTable(var3); // L: 19
		}

		for (var3 = 0; var3 < var2; ++var3) { // L: 21
			boolean var4 = var0.readUnsignedByte() == 1; // L: 22
			int var5 = var0.readMedium(); // L: 23
			Object var6;
			if (var4) {
				var6 = new ObjectNode(var0.readStringCp1252NullTerminated()); // L: 25
			} else {
				var6 = new IntegerNode(var0.readInt()); // L: 26
			}

			var1.put((Node)var6, (long)var5); // L: 27
		}

		return var1; // L: 29
	}
}
