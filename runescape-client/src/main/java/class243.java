import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jk")
public class class243 {
	@ObfuscatedName("ay")
	boolean field2811;
	@ObfuscatedName("an")
	public boolean field2797;
	@ObfuscatedName("ar")
	int field2798;
	@ObfuscatedName("ax")
	public int field2806;
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Ljy;"
	)
	@Export("Rasterizer3D_textureLoader")
	public TextureLoader Rasterizer3D_textureLoader;
	@ObfuscatedName("ae")
	int field2808;
	@ObfuscatedName("ah")
	int field2809;
	@ObfuscatedName("ap")
	int field2810;
	@ObfuscatedName("as")
	int field2802;
	@ObfuscatedName("am")
	int field2799;
	@ObfuscatedName("ao")
	int field2813;
	@ObfuscatedName("af")
	int field2814;
	@ObfuscatedName("av")
	int field2815;
	@ObfuscatedName("aq")
	@Export("Rasterizer3D_rowOffsets")
	int[] Rasterizer3D_rowOffsets;

	class243() {
		this.field2811 = false; // L: 6
		this.field2797 = true; // L: 7
		this.field2798 = 0; // L: 8
		this.field2806 = 512; // L: 11
		this.Rasterizer3D_rowOffsets = new int[1024]; // L: 26
	} // L: 28

	@ObfuscatedName("ay")
	void method4943() {
		this.field2808 = this.field2810 / 2; // L: 31
		this.field2809 = this.field2802 / 2; // L: 32
		this.field2799 = -this.field2808; // L: 33
		this.field2813 = this.field2810 - this.field2808; // L: 34
		this.field2814 = -this.field2809; // L: 35
		this.field2815 = this.field2802 - this.field2809; // L: 36
	} // L: 37

	@ObfuscatedName("an")
	void method4938(int var1, int var2, int var3, int var4) {
		this.field2808 = var1 - var2; // L: 40
		this.field2809 = var3 - var4; // L: 41
		this.field2799 = -this.field2808; // L: 42
		this.field2813 = this.field2810 - this.field2808; // L: 43
		this.field2814 = -this.field2809; // L: 44
		this.field2815 = this.field2802 - this.field2809; // L: 45
	} // L: 46

	@ObfuscatedName("ar")
	void method4939(int var1, int var2, int var3) {
		this.field2811 = var1 < 0 || var1 > this.field2810 || var2 < 0 || var2 > this.field2810 || var3 < 0 || var3 > this.field2810; // L: 49
	} // L: 50
}
