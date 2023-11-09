import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jl")
public class class244 {
	@ObfuscatedName("au")
	boolean field2816;
	@ObfuscatedName("ae")
	public boolean field2811;
	@ObfuscatedName("ao")
	int field2823;
	@ObfuscatedName("ai")
	public int field2815;
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "Ljs;"
	)
	@Export("Rasterizer3D_textureLoader")
	public TextureLoader Rasterizer3D_textureLoader;
	@ObfuscatedName("al")
	int field2810;
	@ObfuscatedName("an")
	int field2825;
	@ObfuscatedName("ar")
	int field2824;
	@ObfuscatedName("ab")
	int field2822;
	@ObfuscatedName("ag")
	int field2819;
	@ObfuscatedName("am")
	int field2827;
	@ObfuscatedName("ax")
	int field2828;
	@ObfuscatedName("ah")
	int field2829;
	@ObfuscatedName("as")
	@Export("Rasterizer3D_rowOffsets")
	int[] Rasterizer3D_rowOffsets;

	class244() {
		this.field2816 = false; // L: 6
		this.field2811 = true; // L: 7
		this.field2823 = 0; // L: 8
		this.field2815 = 512; // L: 11
		this.Rasterizer3D_rowOffsets = new int[1024]; // L: 26
	} // L: 28

	@ObfuscatedName("au")
	void method4956() {
		this.field2810 = this.field2824 / 2; // L: 31
		this.field2825 = this.field2822 / 2; // L: 32
		this.field2819 = -this.field2810; // L: 33
		this.field2827 = this.field2824 - this.field2810; // L: 34
		this.field2828 = -this.field2825; // L: 35
		this.field2829 = this.field2822 - this.field2825; // L: 36
	} // L: 37

	@ObfuscatedName("ae")
	void method4962(int var1, int var2, int var3, int var4) {
		this.field2810 = var1 - var2; // L: 40
		this.field2825 = var3 - var4; // L: 41
		this.field2819 = -this.field2810; // L: 42
		this.field2827 = this.field2824 - this.field2810; // L: 43
		this.field2828 = -this.field2825; // L: 44
		this.field2829 = this.field2822 - this.field2825; // L: 45
	} // L: 46

	@ObfuscatedName("ao")
	void method4958(int var1, int var2, int var3) {
		this.field2816 = var1 < 0 || var1 > this.field2824 || var2 < 0 || var2 > this.field2824 || var3 < 0 || var3 > this.field2824; // L: 49
	} // L: 50
}
