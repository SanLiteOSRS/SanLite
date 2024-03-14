import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("le")
public class class289 {
	@ObfuscatedName("aq")
	boolean field3098;
	@ObfuscatedName("aw")
	public boolean field3085;
	@ObfuscatedName("al")
	int field3086;
	@ObfuscatedName("as")
	public int field3089;
	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "Llo;"
	)
	@Export("Rasterizer3D_textureLoader")
	public TextureLoader Rasterizer3D_textureLoader;
	@ObfuscatedName("aj")
	int field3096;
	@ObfuscatedName("af")
	int field3097;
	@ObfuscatedName("ax")
	int field3084;
	@ObfuscatedName("an")
	int field3088;
	@ObfuscatedName("ag")
	int field3102;
	@ObfuscatedName("am")
	int field3087;
	@ObfuscatedName("ad")
	int field3101;
	@ObfuscatedName("at")
	int field3103;
	@ObfuscatedName("ay")
	@Export("Rasterizer3D_rowOffsets")
	int[] Rasterizer3D_rowOffsets;

	class289() {
		this.field3098 = false; // L: 6
		this.field3085 = true; // L: 7
		this.field3086 = 0; // L: 8
		this.field3089 = 512; // L: 11
		this.Rasterizer3D_rowOffsets = new int[1024]; // L: 26
	} // L: 28

	@ObfuscatedName("aq")
	void method5874() {
		this.field3096 = this.field3084 / 2; // L: 31
		this.field3097 = this.field3088 / 2; // L: 32
		this.field3102 = -this.field3096; // L: 33
		this.field3087 = this.field3084 - this.field3096; // L: 34
		this.field3101 = -this.field3097; // L: 35
		this.field3103 = this.field3088 - this.field3097; // L: 36
	} // L: 37

	@ObfuscatedName("aw")
	void method5873(int var1, int var2, int var3, int var4) {
		this.field3096 = var1 - var2; // L: 40
		this.field3097 = var3 - var4; // L: 41
		this.field3102 = -this.field3096; // L: 42
		this.field3087 = this.field3084 - this.field3096; // L: 43
		this.field3101 = -this.field3097; // L: 44
		this.field3103 = this.field3088 - this.field3097; // L: 45
	} // L: 46

	@ObfuscatedName("al")
	void method5875(int var1, int var2, int var3) {
		this.field3098 = var1 < 0 || var1 > this.field3084 || var2 < 0 || var2 > this.field3084 || var3 < 0 || var3 > this.field3084; // L: 49
	} // L: 50
}
