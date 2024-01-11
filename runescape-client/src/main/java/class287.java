import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("lp")
public class class287 {
	@ObfuscatedName("am")
	boolean field3098;
	@ObfuscatedName("ap")
	public boolean field3080;
	@ObfuscatedName("af")
	int field3081;
	@ObfuscatedName("ar")
	public int field3092;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Llg;"
	)
	@Export("Rasterizer3D_textureLoader")
	public TextureLoader Rasterizer3D_textureLoader;
	@ObfuscatedName("ad")
	int field3091;
	@ObfuscatedName("ax")
	int field3093;
	@ObfuscatedName("aw")
	int field3079;
	@ObfuscatedName("az")
	int field3085;
	@ObfuscatedName("av")
	int field3095;
	@ObfuscatedName("ak")
	int field3096;
	@ObfuscatedName("ay")
	int field3097;
	@ObfuscatedName("as")
	int field3099;
	@ObfuscatedName("ab")
	@Export("Rasterizer3D_rowOffsets")
	int[] Rasterizer3D_rowOffsets;

	class287() {
		this.field3098 = false; // L: 6
		this.field3080 = true; // L: 7
		this.field3081 = 0; // L: 8
		this.field3092 = 512; // L: 11
		this.Rasterizer3D_rowOffsets = new int[1024]; // L: 26
	} // L: 28

	@ObfuscatedName("am")
	void method5813() {
		this.field3091 = this.field3079 / 2; // L: 31
		this.field3093 = this.field3085 / 2; // L: 32
		this.field3095 = -this.field3091; // L: 33
		this.field3096 = this.field3079 - this.field3091; // L: 34
		this.field3097 = -this.field3093; // L: 35
		this.field3099 = this.field3085 - this.field3093; // L: 36
	} // L: 37

	@ObfuscatedName("ap")
	void method5814(int var1, int var2, int var3, int var4) {
		this.field3091 = var1 - var2; // L: 40
		this.field3093 = var3 - var4; // L: 41
		this.field3095 = -this.field3091; // L: 42
		this.field3096 = this.field3079 - this.field3091; // L: 43
		this.field3097 = -this.field3093; // L: 44
		this.field3099 = this.field3085 - this.field3093; // L: 45
	} // L: 46

	@ObfuscatedName("af")
	void method5822(int var1, int var2, int var3) {
		this.field3098 = var1 < 0 || var1 > this.field3079 || var2 < 0 || var2 > this.field3079 || var3 < 0 || var3 > this.field3079; // L: 49
	} // L: 50
}
