import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("kh")
public class class284 {
	@ObfuscatedName("at")
	boolean field3036;
	@ObfuscatedName("ah")
	public boolean field3038;
	@ObfuscatedName("ar")
	int field3051;
	@ObfuscatedName("au")
	public int field3041;
	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "Llw;"
	)
	@Export("Rasterizer3D_textureLoader")
	public TextureLoader Rasterizer3D_textureLoader;
	@ObfuscatedName("ax")
	int field3037;
	@ObfuscatedName("as")
	int field3049;
	@ObfuscatedName("ay")
	int field3050;
	@ObfuscatedName("ak")
	int field3039;
	@ObfuscatedName("aj")
	int field3052;
	@ObfuscatedName("am")
	int field3053;
	@ObfuscatedName("aq")
	int field3054;
	@ObfuscatedName("ai")
	int field3055;
	@ObfuscatedName("aw")
	@Export("Rasterizer3D_rowOffsets")
	int[] Rasterizer3D_rowOffsets;

	class284() {
		this.field3036 = false; // L: 6
		this.field3038 = true; // L: 7
		this.field3051 = 0; // L: 8
		this.field3041 = 512; // L: 11
		this.Rasterizer3D_rowOffsets = new int[1024]; // L: 26
	} // L: 28

	@ObfuscatedName("at")
	void method5733() {
		this.field3037 = this.field3050 / 2; // L: 31
		this.field3049 = this.field3039 / 2; // L: 32
		this.field3052 = -this.field3037; // L: 33
		this.field3053 = this.field3050 - this.field3037; // L: 34
		this.field3054 = -this.field3049; // L: 35
		this.field3055 = this.field3039 - this.field3049; // L: 36
	} // L: 37

	@ObfuscatedName("ah")
	void method5734(int var1, int var2, int var3, int var4) {
		this.field3037 = var1 - var2; // L: 40
		this.field3049 = var3 - var4; // L: 41
		this.field3052 = -this.field3037; // L: 42
		this.field3053 = this.field3050 - this.field3037; // L: 43
		this.field3054 = -this.field3049; // L: 44
		this.field3055 = this.field3039 - this.field3049; // L: 45
	} // L: 46

	@ObfuscatedName("ar")
	void method5735(int var1, int var2, int var3) {
		this.field3036 = var1 < 0 || var1 > this.field3050 || var2 < 0 || var2 > this.field3050 || var3 < 0 || var3 > this.field3050; // L: 49
	} // L: 50
}
