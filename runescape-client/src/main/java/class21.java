import java.awt.Component;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("f")
public class class21 extends class14 {
	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "[Lne;"
	)
	@Export("JagexCache_idxFiles")
	public static BufferedFile[] JagexCache_idxFiles;
	@ObfuscatedName("j")
	@ObfuscatedGetter(
		intValue = -570442273
	)
	@Export("loginBoxCenter")
	static int loginBoxCenter;
	@ObfuscatedName("h")
	@ObfuscatedGetter(
		intValue = 147017797
	)
	int field178;
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = 1652610383
	)
	int field176;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = -1956638369
	)
	int field177;
	@ObfuscatedName("g")
	@ObfuscatedGetter(
		intValue = -540274733
	)
	int field180;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lo;"
	)
	final class2 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lo;)V"
	)
	class21(class2 var1) {
		this.this$0 = var1;
		this.field178 = -1;
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(Lnk;I)V",
		garbageValue = "110401227"
	)
	void vmethod339(Buffer var1) {
		this.field178 = var1.readUnsignedShort();
		this.field176 = var1.readInt();
		this.field177 = var1.readUnsignedByte();
		this.field180 = var1.readUnsignedByte();
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(Lx;I)V",
		garbageValue = "-1535989118"
	)
	void vmethod338(class11 var1) {
		var1.method156(this.field178, this.field176, this.field177, this.field180);
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(Ljava/awt/Component;I)V",
		garbageValue = "-1194804583"
	)
	static void method289(Component var0) {
		var0.removeMouseListener(MouseHandler.MouseHandler_instance);
		var0.removeMouseMotionListener(MouseHandler.MouseHandler_instance);
		var0.removeFocusListener(MouseHandler.MouseHandler_instance);
		MouseHandler.MouseHandler_currentButtonVolatile = 0;
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(I)Lbc;",
		garbageValue = "1069848979"
	)
	@Export("worldListStart")
	static World worldListStart() {
		World.World_listCount = 0;
		return class13.getNextWorldListWorld();
	}

	@ObfuscatedName("fi")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "-2096544393"
	)
	static int method281(int var0) {
		return var0 * 3 + 600;
	}
}
