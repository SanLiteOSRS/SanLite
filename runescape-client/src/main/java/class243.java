import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jy")
public class class243 {
	@ObfuscatedName("at")
	boolean field2798;
	@ObfuscatedName("an")
	public boolean field2805;
	@ObfuscatedName("av")
	int field2793;
	@ObfuscatedName("ap")
	public int field2796;
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Ljb;"
	)
	@Export("Rasterizer3D_textureLoader")
	public TextureLoader Rasterizer3D_textureLoader;
	@ObfuscatedName("aj")
	int field2803;
	@ObfuscatedName("ad")
	int field2804;
	@ObfuscatedName("ac")
	int field2800;
	@ObfuscatedName("ag")
	int field2806;
	@ObfuscatedName("ar")
	int field2797;
	@ObfuscatedName("ah")
	int field2808;
	@ObfuscatedName("az")
	int field2809;
	@ObfuscatedName("au")
	int field2810;
	@ObfuscatedName("ai")
	@Export("Rasterizer3D_rowOffsets")
	int[] Rasterizer3D_rowOffsets;

	class243() {
		this.field2798 = false; // L: 6
		this.field2805 = true; // L: 7
		this.field2793 = 0; // L: 8
		this.field2796 = 512; // L: 11
		this.Rasterizer3D_rowOffsets = new int[1024]; // L: 26
	} // L: 28

	@ObfuscatedName("at")
	void method4956() {
		this.field2803 = this.field2800 / 2; // L: 31
		this.field2804 = this.field2806 / 2; // L: 32
		this.field2797 = -this.field2803; // L: 33
		this.field2808 = this.field2800 - this.field2803; // L: 34
		this.field2809 = -this.field2804; // L: 35
		this.field2810 = this.field2806 - this.field2804; // L: 36
	} // L: 37

	@ObfuscatedName("an")
	void method4957(int var1, int var2, int var3, int var4) {
		this.field2803 = var1 - var2; // L: 40
		this.field2804 = var3 - var4; // L: 41
		this.field2797 = -this.field2803; // L: 42
		this.field2808 = this.field2800 - this.field2803; // L: 43
		this.field2809 = -this.field2804; // L: 44
		this.field2810 = this.field2806 - this.field2804; // L: 45
	} // L: 46

	@ObfuscatedName("av")
	void method4955(int var1, int var2, int var3) {
		this.field2798 = var1 < 0 || var1 > this.field2800 || var2 < 0 || var2 > this.field2800 || var3 < 0 || var3 > this.field2800; // L: 49
	} // L: 50
}
