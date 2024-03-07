import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("tc")
public class class495 extends class498 {
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = 1932951449
	)
	int field4967;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = -1529474941
	)
	int field4962;
	@ObfuscatedName("al")
	double field4963;
	@ObfuscatedName("ai")
	double field4964;
	@ObfuscatedName("ar")
	double field4965;
	@ObfuscatedName("as")
	double field4966;
	@ObfuscatedName("aa")
	double field4969;

	public class495(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10) {
		super(var9, var10); // L: 13
		this.field4967 = 0; // L: 4
		this.field4962 = 0; // L: 5
		this.field4963 = 0.0D; // L: 6
		this.field4964 = 0.0D; // L: 7
		this.field4965 = 0.0D; // L: 8
		this.field4966 = 0.0D; // L: 9
		this.field4969 = 0.0D; // L: 10
		this.field4967 = var3; // L: 14
		this.field4962 = var6; // L: 15
		if ((var5 - var8) * (var7 - var1) == (var4 - var7) * (var8 - var2)) { // L: 16
			this.field4963 = (double)var4; // L: 17
			this.field4964 = (double)var5; // L: 18
		} else {
			double var11 = (double)((float)(var7 + var1)) / 2.0D; // L: 21
			double var13 = (double)((float)(var8 + var2)) / 2.0D; // L: 22
			double var15 = (double)((float)(var4 + var7)) / 2.0D; // L: 23
			double var17 = (double)((float)(var5 + var8)) / 2.0D; // L: 24
			double var19 = -1.0D * (double)(var7 - var1) / (double)(var8 - var2); // L: 25
			double var21 = (double)(var4 - var7) * -1.0D / (double)(var5 - var8); // L: 26
			this.field4963 = (var17 + (var11 * var19 - var15 * var21) - var13) / (var19 - var21); // L: 27
			this.field4964 = var19 * (this.field4963 - var11) + var13; // L: 28
			this.field4965 = Math.sqrt(Math.pow(this.field4963 - (double)var1, 2.0D) + Math.pow(this.field4964 - (double)var2, 2.0D)); // L: 29
			this.field4966 = Math.atan2((double)var2 - this.field4964, (double)var1 - this.field4963); // L: 30
			double var23 = Math.atan2((double)var8 - this.field4964, (double)var7 - this.field4963); // L: 31
			this.field4969 = Math.atan2((double)var5 - this.field4964, (double)var4 - this.field4963); // L: 32
			boolean var25 = this.field4966 <= var23 && var23 <= this.field4969 || this.field4969 <= var23 && var23 <= this.field4966; // L: 33
			if (!var25) { // L: 34
				this.field4969 += (double)(this.field4966 - this.field4969 > 0.0D ? 2 : -2) * 3.141592653589793D; // L: 35
			}

		}
	} // L: 19 37

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1316582552"
	)
	public int vmethod8869() {
		double var1 = this.method8876(); // L: 40
		double var3 = var1 * (this.field4969 - this.field4966) + this.field4966; // L: 41
		return (int)Math.round(this.field4963 + this.field4965 * Math.cos(var3)); // L: 42
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1514290339"
	)
	public int vmethod8868() {
		double var1 = this.method8876(); // L: 46
		double var3 = var1 * (this.field4969 - this.field4966) + this.field4966; // L: 47
		return (int)Math.round(this.field4964 + this.field4965 * Math.sin(var3)); // L: 48
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-79"
	)
	public int vmethod8874() {
		double var1 = this.method8876(); // L: 52
		return (int)Math.round(var1 * (double)(this.field4962 - this.field4967) + (double)this.field4967); // L: 53
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Luq;B)Ljava/lang/String;",
		garbageValue = "-75"
	)
	public static String method8856(Buffer var0) {
		String var1;
		try {
			int var2 = var0.readUShortSmart(); // L: 63
			if (var2 > 32767) { // L: 64
				var2 = 32767;
			}

			byte[] var3 = new byte[var2]; // L: 65
			var0.offset += class405.huffman.decompress(var0.array, var0.offset, var3, 0, var2); // L: 66
			String var4 = class102.decodeStringCp1252(var3, 0, var2); // L: 67
			var1 = var4; // L: 68
		} catch (Exception var6) { // L: 70
			var1 = "Cabbage"; // L: 71
		}

		return var1; // L: 74
	}
}
