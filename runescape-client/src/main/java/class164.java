import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gm")
public class class164 extends class145 {
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = -40499127
	)
	static int field1796;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = -2006007689
	)
	int field1795;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lfg;"
	)
	final class148 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lfg;)V"
	)
	class164(class148 var1) {
		this.this$0 = var1;
		this.field1795 = -1; // L: 144
	} // L: 146

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(Luq;I)V",
		garbageValue = "584073694"
	)
	void vmethod3512(Buffer var1) {
		this.field1795 = var1.readUnsignedShort(); // L: 149
	} // L: 150

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Lgt;I)V",
		garbageValue = "406847376"
	)
	void vmethod3513(ClanSettings var1) {
		var1.method3364(this.field1795); // L: 153
	} // L: 154

	@ObfuscatedName("az")
	public static boolean method3461(long var0) {
		return (int)(var0 >>> 16 & 1L) == 1; // L: 77
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(IIS)V",
		garbageValue = "-22481"
	)
	public static final void method3467(int var0, int var1) {
		ViewportMouse.ViewportMouse_x = var0; // L: 91
		ViewportMouse.ViewportMouse_y = var1; // L: 92
		ViewportMouse.ViewportMouse_isInViewport = true; // L: 93
		ViewportMouse.ViewportMouse_entityCount = 0; // L: 94
		ViewportMouse.ViewportMouse_false0 = false; // L: 95
	} // L: 96
}
