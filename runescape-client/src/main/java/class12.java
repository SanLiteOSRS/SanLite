import java.awt.Component;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("k")
public class class12 extends class16 {
	@ObfuscatedName("sc")
	@ObfuscatedSignature(
		descriptor = "Lcv;"
	)
	@Export("clientPreferences")
	static ClientPreferences clientPreferences;
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "Low;"
	)
	@Export("rightTitleSprite")
	static SpritePixels rightTitleSprite;
	@ObfuscatedName("h")
	String field118;
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = -775635411
	)
	int field116;
	@ObfuscatedName("o")
	byte field115;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lm;"
	)
	final class19 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lm;)V"
	)
	class12(class19 var1) {
		this.this$0 = var1;
		this.field118 = null;
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(Lnk;S)V",
		garbageValue = "4095"
	)
	void vmethod326(Buffer var1) {
		if (var1.readUnsignedByte() != 255) {
			--var1.offset;
			var1.readLong();
		}

		this.field118 = var1.readStringCp1252NullTerminatedOrNull();
		this.field116 = var1.readUnsignedShort();
		this.field115 = var1.readByte();
		var1.readLong();
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(Lg;B)V",
		garbageValue = "-61"
	)
	void vmethod314(class3 var1) {
		class9 var2 = new class9();
		var2.field73 = this.field118;
		var2.field80 = this.field116;
		var2.field76 = this.field115;
		var1.method29(var2);
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(Ljava/awt/Component;I)V",
		garbageValue = "-711210303"
	)
	static void method192(Component var0) {
		var0.addMouseListener(MouseHandler.MouseHandler_instance);
		var0.addMouseMotionListener(MouseHandler.MouseHandler_instance);
		var0.addFocusListener(MouseHandler.MouseHandler_instance);
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1237759472"
	)
	public static void method203() {
		class69.reflectionChecks = new IterableNodeDeque();
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "54"
	)
	public static void method202() {
		WorldMapElement.Widget_cachedSprites.clear();
	}
}
