import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fs")
public class class145 extends class144 {
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = -322943895
	)
	@Export("RunException_revision")
	public static int RunException_revision;
	@ObfuscatedName("fj")
	@ObfuscatedSignature(
		descriptor = "Loh;"
	)
	static Archive field1643;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = -896259429
	)
	int field1639;
	@ObfuscatedName("ah")
	boolean field1644;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lfv;"
	)
	final class147 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lfv;)V"
	)
	class145(class147 var1) {
		this.this$0 = var1;
		this.field1639 = -1; // L: 178
	} // L: 181

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Luj;I)V",
		garbageValue = "-734756620"
	)
	void vmethod3510(Buffer var1) {
		this.field1639 = var1.readUnsignedShort(); // L: 184
		this.field1644 = var1.readUnsignedByte() == 1; // L: 185
	} // L: 186

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(Lfc;I)V",
		garbageValue = "-2111347169"
	)
	void vmethod3506(ClanSettings var1) {
		var1.method3334(this.field1639, this.field1644); // L: 189
	} // L: 190

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-7051987"
	)
	public static void method3247() {
		class172.field1807.clear(); // L: 14
	} // L: 15

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(FFFFLfm;B)V",
		garbageValue = "6"
	)
	static void method3246(float var0, float var1, float var2, float var3, class131 var4) {
		float var5 = var1 - var0; // L: 329
		float var6 = var2 - var1; // L: 330
		float var7 = var3 - var2; // L: 331
		float var8 = var6 - var5; // L: 332
		var4.field1537 = var7 - var6 - var8; // L: 333
		var4.field1526 = var8 + var8 + var8; // L: 334
		var4.field1548 = var5 + var5 + var5; // L: 335
		var4.field1534 = var0; // L: 336
	} // L: 337
}
