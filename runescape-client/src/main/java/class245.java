import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jq")
public class class245 {
	@ObfuscatedName("aw")
	boolean field2793;
	@ObfuscatedName("ay")
	public boolean field2792;
	@ObfuscatedName("ar")
	int field2783;
	@ObfuscatedName("aj")
	public int field2781;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Ljy;"
	)
	@Export("Rasterizer3D_textureLoader")
	public TextureLoader Rasterizer3D_textureLoader;
	@ObfuscatedName("ah")
	int field2800;
	@ObfuscatedName("ax")
	int field2794;
	@ObfuscatedName("aa")
	int field2795;
	@ObfuscatedName("au")
	int field2796;
	@ObfuscatedName("ae")
	int field2797;
	@ObfuscatedName("ab")
	int field2786;
	@ObfuscatedName("ad")
	int field2799;
	@ObfuscatedName("ao")
	int field2798;
	@ObfuscatedName("ac")
	@Export("Rasterizer3D_rowOffsets")
	int[] Rasterizer3D_rowOffsets;

	class245() {
		this.field2793 = false; // L: 6
		this.field2792 = true; // L: 7
		this.field2783 = 0; // L: 8
		this.field2781 = 512; // L: 11
		this.Rasterizer3D_rowOffsets = new int[1024]; // L: 26
	} // L: 28

	@ObfuscatedName("aw")
	void method4987() {
		this.field2800 = this.field2795 / 2; // L: 31
		this.field2794 = this.field2796 / 2; // L: 32
		this.field2797 = -this.field2800; // L: 33
		this.field2786 = this.field2795 - this.field2800; // L: 34
		this.field2799 = -this.field2794; // L: 35
		this.field2798 = this.field2796 - this.field2794; // L: 36
	} // L: 37

	@ObfuscatedName("ay")
	void method4984(int var1, int var2, int var3, int var4) {
		this.field2800 = var1 - var2; // L: 40
		this.field2794 = var3 - var4; // L: 41
		this.field2797 = -this.field2800; // L: 42
		this.field2786 = this.field2795 - this.field2800; // L: 43
		this.field2799 = -this.field2794; // L: 44
		this.field2798 = this.field2796 - this.field2794; // L: 45
	} // L: 46

	@ObfuscatedName("ar")
	void method4985(int var1, int var2, int var3) {
		this.field2793 = var1 < 0 || var1 > this.field2795 || var2 < 0 || var2 > this.field2795 || var3 < 0 || var3 > this.field2795; // L: 49
	} // L: 50
}
