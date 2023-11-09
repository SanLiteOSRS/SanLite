import java.awt.Component;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hb")
@Implements("InvDefinition")
public class InvDefinition extends DualNode {
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Lne;"
	)
	@Export("InvDefinition_archive")
	static AbstractArchive InvDefinition_archive;
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Lkt;"
	)
	@Export("InvDefinition_cached")
	static EvictingDualNodeHashTable InvDefinition_cached;
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Lkh;"
	)
	@Export("worldMapEvent")
	static WorldMapEvent worldMapEvent;
	@ObfuscatedName("bj")
	static String field1884;
	@ObfuscatedName("op")
	@ObfuscatedSignature(
		descriptor = "Lmy;"
	)
	@Export("mousedOverWidgetIf1")
	static Widget mousedOverWidgetIf1;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = -684508907
	)
	@Export("size")
	public int size;

	static {
		InvDefinition_cached = new EvictingDualNodeHashTable(64); // L: 11
	}

	InvDefinition() {
		this.size = 0; // L: 12
	} // L: 14

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(Lsy;I)V",
		garbageValue = "-667429593"
	)
	@Export("decode")
	void decode(Buffer var1) {
		while (true) {
			int var2 = var1.readUnsignedByte(); // L: 32
			if (var2 == 0) { // L: 33
				return; // L: 36
			}

			this.decodeNext(var1, var2); // L: 34
		}
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(Lsy;II)V",
		garbageValue = "454664689"
	)
	@Export("decodeNext")
	void decodeNext(Buffer var1, int var2) {
		if (var2 == 2) { // L: 39
			this.size = var1.readUnsignedShort();
		}

	} // L: 41

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(Ljava/awt/Component;B)V",
		garbageValue = "16"
	)
	static void method3545(Component var0) {
		var0.removeMouseListener(MouseHandler.KeyHandler_instance); // L: 43
		var0.removeMouseMotionListener(MouseHandler.KeyHandler_instance); // L: 44
		var0.removeFocusListener(MouseHandler.KeyHandler_instance); // L: 45
		MouseHandler.MouseHandler_currentButtonVolatile = 0; // L: 46
	} // L: 47
}
