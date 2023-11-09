import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jd")
public class class244 {
	@ObfuscatedName("ai")
	boolean field2810;
	@ObfuscatedName("aj")
	public boolean field2798;
	@ObfuscatedName("ac")
	int field2802;
	@ObfuscatedName("ap")
	public int field2799;
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "Ljx;"
	)
	@Export("Rasterizer3D_textureLoader")
	public TextureLoader Rasterizer3D_textureLoader;
	@ObfuscatedName("as")
	int field2816;
	@ObfuscatedName("am")
	int field2811;
	@ObfuscatedName("ag")
	int field2812;
	@ObfuscatedName("aa")
	int field2813;
	@ObfuscatedName("ar")
	int field2814;
	@ObfuscatedName("ad")
	int field2806;
	@ObfuscatedName("at")
	int field2803;
	@ObfuscatedName("af")
	int field2817;
	@ObfuscatedName("ae")
	@Export("Rasterizer3D_rowOffsets")
	int[] Rasterizer3D_rowOffsets;

	class244() {
		this.field2810 = false; // L: 6
		this.field2798 = true; // L: 7
		this.field2802 = 0; // L: 8
		this.field2799 = 512; // L: 11
		this.Rasterizer3D_rowOffsets = new int[1024]; // L: 26
	} // L: 28

	@ObfuscatedName("ai")
	void method5038() {
		this.field2816 = this.field2812 / 2; // L: 31
		this.field2811 = this.field2813 / 2; // L: 32
		this.field2814 = -this.field2816; // L: 33
		this.field2806 = this.field2812 - this.field2816; // L: 34
		this.field2803 = -this.field2811; // L: 35
		this.field2817 = this.field2813 - this.field2811; // L: 36
	} // L: 37

	@ObfuscatedName("aj")
	void method5047(int var1, int var2, int var3, int var4) {
		this.field2816 = var1 - var2; // L: 40
		this.field2811 = var3 - var4; // L: 41
		this.field2814 = -this.field2816; // L: 42
		this.field2806 = this.field2812 - this.field2816; // L: 43
		this.field2803 = -this.field2811; // L: 44
		this.field2817 = this.field2813 - this.field2811; // L: 45
	} // L: 46

	@ObfuscatedName("ac")
	void method5040(int var1, int var2, int var3) {
		this.field2810 = var1 < 0 || var1 > this.field2812 || var2 < 0 || var2 > this.field2812 || var3 < 0 || var3 > this.field2812; // L: 49
	} // L: 50
}
