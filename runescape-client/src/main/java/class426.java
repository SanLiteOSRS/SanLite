import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("qc")
public class class426 {
	@ObfuscatedName("fa")
	@ObfuscatedSignature(
		descriptor = "Lnd;"
	)
	@Export("archive4")
	static Archive archive4;
	@ObfuscatedName("af")
	float field4686;
	@ObfuscatedName("an")
	float field4675;
	@ObfuscatedName("aw")
	float field4676;
	@ObfuscatedName("ac")
	float field4677;
	@ObfuscatedName("au")
	float field4678;
	@ObfuscatedName("ab")
	float field4679;
	@ObfuscatedName("aq")
	float field4680;
	@ObfuscatedName("al")
	float field4681;
	@ObfuscatedName("at")
	float field4682;
	@ObfuscatedName("aa")
	float field4683;
	@ObfuscatedName("ay")
	float field4684;
	@ObfuscatedName("ao")
	float field4685;

	static {
		new class426();
	} // L: 6

	class426() {
		this.method8255(); // L: 22
	} // L: 23

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(S)V",
		garbageValue = "-23475"
	)
	void method8255() {
		this.field4685 = 0.0F; // L: 26
		this.field4684 = 0.0F; // L: 27
		this.field4683 = 0.0F; // L: 28
		this.field4681 = 0.0F; // L: 29
		this.field4680 = 0.0F; // L: 30
		this.field4679 = 0.0F; // L: 31
		this.field4677 = 0.0F; // L: 32
		this.field4676 = 0.0F; // L: 33
		this.field4675 = 0.0F; // L: 34
		this.field4682 = 1.0F; // L: 35
		this.field4678 = 1.0F; // L: 36
		this.field4686 = 1.0F; // L: 37
	} // L: 38

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(FI)V",
		garbageValue = "-1749175533"
	)
	void method8246(float var1) {
		float var2 = (float)Math.cos((double)var1); // L: 41
		float var3 = (float)Math.sin((double)var1); // L: 42
		float var4 = this.field4675; // L: 43
		float var5 = this.field4678; // L: 44
		float var6 = this.field4681; // L: 45
		float var7 = this.field4684; // L: 46
		this.field4675 = var4 * var2 - this.field4676 * var3; // L: 47
		this.field4676 = this.field4676 * var2 + var3 * var4; // L: 48
		this.field4678 = var2 * var5 - var3 * this.field4679; // L: 49
		this.field4679 = this.field4679 * var2 + var5 * var3; // L: 50
		this.field4681 = var6 * var2 - var3 * this.field4682; // L: 51
		this.field4682 = this.field4682 * var2 + var3 * var6; // L: 52
		this.field4684 = var2 * var7 - this.field4685 * var3; // L: 53
		this.field4685 = var3 * var7 + var2 * this.field4685; // L: 54
	} // L: 55

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(FI)V",
		garbageValue = "1665202061"
	)
	void method8247(float var1) {
		float var2 = (float)Math.cos((double)var1); // L: 58
		float var3 = (float)Math.sin((double)var1); // L: 59
		float var4 = this.field4686; // L: 60
		float var5 = this.field4677; // L: 61
		float var6 = this.field4680; // L: 62
		float var7 = this.field4683; // L: 63
		this.field4686 = var3 * this.field4676 + var2 * var4; // L: 64
		this.field4676 = var2 * this.field4676 - var4 * var3; // L: 65
		this.field4677 = var3 * this.field4679 + var5 * var2; // L: 66
		this.field4679 = this.field4679 * var2 - var5 * var3; // L: 67
		this.field4680 = var3 * this.field4682 + var2 * var6; // L: 68
		this.field4682 = this.field4682 * var2 - var3 * var6; // L: 69
		this.field4683 = var2 * var7 + var3 * this.field4685; // L: 70
		this.field4685 = var2 * this.field4685 - var7 * var3; // L: 71
	} // L: 72

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(FB)V",
		garbageValue = "61"
	)
	void method8248(float var1) {
		float var2 = (float)Math.cos((double)var1); // L: 75
		float var3 = (float)Math.sin((double)var1); // L: 76
		float var4 = this.field4686; // L: 77
		float var5 = this.field4677; // L: 78
		float var6 = this.field4680; // L: 79
		float var7 = this.field4683; // L: 80
		this.field4686 = var4 * var2 - this.field4675 * var3; // L: 81
		this.field4675 = var2 * this.field4675 + var4 * var3; // L: 82
		this.field4677 = var5 * var2 - this.field4678 * var3; // L: 83
		this.field4678 = var3 * var5 + var2 * this.field4678; // L: 84
		this.field4680 = var2 * var6 - this.field4681 * var3; // L: 85
		this.field4681 = var2 * this.field4681 + var3 * var6; // L: 86
		this.field4683 = var2 * var7 - var3 * this.field4684; // L: 87
		this.field4684 = var2 * this.field4684 + var3 * var7; // L: 88
	} // L: 89

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(FFFB)V",
		garbageValue = "117"
	)
	void method8245(float var1, float var2, float var3) {
		this.field4683 += var1; // L: 92
		this.field4684 += var2; // L: 93
		this.field4685 += var3; // L: 94
	} // L: 95

	public String toString() {
		return this.field4686 + "," + this.field4677 + "," + this.field4680 + "," + this.field4683 + "\n" + this.field4675 + "," + this.field4678 + "," + this.field4681 + "," + this.field4684 + "\n" + this.field4676 + "," + this.field4679 + "," + this.field4682 + "," + this.field4685; // L: 99
	}

	@ObfuscatedName("ns")
	@ObfuscatedSignature(
		descriptor = "(IIIILtq;Lll;I)V",
		garbageValue = "-1609285207"
	)
	@Export("drawSpriteOnMinimap")
	static final void drawSpriteOnMinimap(int var0, int var1, int var2, int var3, SpritePixels var4, SpriteMask var5) {
		if (var4 != null) { // L: 11973
			int var6 = Client.camAngleY & 2047; // L: 11974
			int var7 = var3 * var3 + var2 * var2; // L: 11975
			if (var7 <= 6400) { // L: 11976
				int var8 = Rasterizer3D.Rasterizer3D_sine[var6]; // L: 11977
				int var9 = Rasterizer3D.Rasterizer3D_cosine[var6]; // L: 11978
				int var10 = var9 * var2 + var3 * var8 >> 16; // L: 11979
				int var11 = var3 * var9 - var8 * var2 >> 16; // L: 11980
				if (var7 > 2500) {
					var4.method9512(var10 + var5.width / 2 - var4.width / 2, var5.height / 2 - var11 - var4.height / 2, var0, var1, var5.width, var5.height, var5.xStarts, var5.xWidths); // L: 11981
				} else {
					var4.drawTransBgAt(var0 + var10 + var5.width / 2 - var4.width / 2, var5.height / 2 + var1 - var11 - var4.height / 2); // L: 11982
				}

			}
		}
	} // L: 11983
}
