import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ko")
public class class260 {
	@ObfuscatedName("az")
	boolean field2893;
	@ObfuscatedName("ah")
	public boolean field2885;
	@ObfuscatedName("af")
	int field2886;
	@ObfuscatedName("ao")
	public int field2889;
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Lkd;"
	)
	@Export("Rasterizer3D_textureLoader")
	public TextureLoader Rasterizer3D_textureLoader;
	@ObfuscatedName("ai")
	int field2896;
	@ObfuscatedName("ax")
	int field2897;
	@ObfuscatedName("ar")
	int field2899;
	@ObfuscatedName("aj")
	int field2892;
	@ObfuscatedName("au")
	int field2898;
	@ObfuscatedName("ay")
	int field2890;
	@ObfuscatedName("ap")
	int field2902;
	@ObfuscatedName("av")
	int field2903;
	@ObfuscatedName("aa")
	@Export("Rasterizer3D_rowOffsets")
	int[] Rasterizer3D_rowOffsets;

	class260() {
		this.field2893 = false; // L: 6
		this.field2885 = true; // L: 7
		this.field2886 = 0; // L: 8
		this.field2889 = 512; // L: 11
		this.Rasterizer3D_rowOffsets = new int[1024]; // L: 26
	} // L: 28

	@ObfuscatedName("az")
	void method5144() {
		this.field2896 = this.field2899 / 2; // L: 31
		this.field2897 = this.field2892 / 2; // L: 32
		this.field2898 = -this.field2896; // L: 33
		this.field2890 = this.field2899 - this.field2896; // L: 34
		this.field2902 = -this.field2897; // L: 35
		this.field2903 = this.field2892 - this.field2897; // L: 36
	} // L: 37

	@ObfuscatedName("ah")
	void method5134(int var1, int var2, int var3, int var4) {
		this.field2896 = var1 - var2; // L: 40
		this.field2897 = var3 - var4; // L: 41
		this.field2898 = -this.field2896; // L: 42
		this.field2890 = this.field2899 - this.field2896; // L: 43
		this.field2902 = -this.field2897; // L: 44
		this.field2903 = this.field2892 - this.field2897; // L: 45
	} // L: 46

	@ObfuscatedName("af")
	void method5133(int var1, int var2, int var3) {
		this.field2893 = var1 < 0 || var1 > this.field2899 || var2 < 0 || var2 > this.field2899 || var3 < 0 || var3 > this.field2899; // L: 49
	} // L: 50
}
