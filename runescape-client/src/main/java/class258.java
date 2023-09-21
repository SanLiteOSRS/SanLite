import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jb")
public class class258 {
	@ObfuscatedName("ac")
	boolean field2838;
	@ObfuscatedName("al")
	public boolean field2831;
	@ObfuscatedName("ak")
	int field2832;
	@ObfuscatedName("ah")
	public int field2830;
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "Lkg;"
	)
	@Export("Rasterizer3D_textureLoader")
	public TextureLoader Rasterizer3D_textureLoader;
	@ObfuscatedName("ap")
	int field2848;
	@ObfuscatedName("ay")
	int field2843;
	@ObfuscatedName("as")
	int field2842;
	@ObfuscatedName("aj")
	int field2845;
	@ObfuscatedName("an")
	int field2846;
	@ObfuscatedName("au")
	int field2850;
	@ObfuscatedName("ai")
	int field2844;
	@ObfuscatedName("ae")
	int field2849;
	@ObfuscatedName("aw")
	@Export("Rasterizer3D_rowOffsets")
	int[] Rasterizer3D_rowOffsets;

	class258() {
		this.field2838 = false; // L: 6
		this.field2831 = true; // L: 7
		this.field2832 = 0; // L: 8
		this.field2830 = 512; // L: 11
		this.Rasterizer3D_rowOffsets = new int[1024]; // L: 26
	} // L: 28

	@ObfuscatedName("ac")
	void method5108() {
		this.field2848 = this.field2842 / 2; // L: 31
		this.field2843 = this.field2845 / 2; // L: 32
		this.field2846 = -this.field2848; // L: 33
		this.field2850 = this.field2842 - this.field2848; // L: 34
		this.field2844 = -this.field2843; // L: 35
		this.field2849 = this.field2845 - this.field2843; // L: 36
	} // L: 37

	@ObfuscatedName("al")
	void method5107(int var1, int var2, int var3, int var4) {
		this.field2848 = var1 - var2; // L: 40
		this.field2843 = var3 - var4; // L: 41
		this.field2846 = -this.field2848; // L: 42
		this.field2850 = this.field2842 - this.field2848; // L: 43
		this.field2844 = -this.field2843; // L: 44
		this.field2849 = this.field2845 - this.field2843; // L: 45
	} // L: 46

	@ObfuscatedName("ak")
	void method5109(int var1, int var2, int var3) {
		this.field2838 = var1 < 0 || var1 > this.field2842 || var2 < 0 || var2 > this.field2842 || var3 < 0 || var3 > this.field2842; // L: 49
	} // L: 50
}
