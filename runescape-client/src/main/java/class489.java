import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("sf")
public class class489 extends class491 {
	@ObfuscatedName("wn")
	@ObfuscatedGetter(
		longValue = -5839657561749084617L
	)
	static long field4905;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = -2067547125
	)
	int field4909;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = 1293546229
	)
	int field4904;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = -756292095
	)
	int field4903;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = -772532653
	)
	int field4906;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = -1858483053
	)
	int field4907;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = -1981838053
	)
	int field4908;

	public class489(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
		super(var7, var8); // L: 12
		this.field4909 = 0; // L: 4
		this.field4904 = 0; // L: 5
		this.field4903 = 0; // L: 6
		this.field4906 = 0; // L: 7
		this.field4907 = 0; // L: 8
		this.field4908 = 0; // L: 9
		this.field4909 = var1; // L: 13
		this.field4904 = var2; // L: 14
		this.field4903 = var3; // L: 15
		this.field4906 = var4;
		this.field4907 = var5; // L: 17
		this.field4908 = var6; // L: 18
	} // L: 19

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "2"
	)
	public int vmethod8673() {
		double var1 = this.method8685(); // L: 22
		return (int)Math.round((double)(this.field4906 - this.field4909) * var1 + (double)this.field4909); // L: 23
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "124"
	)
	public int vmethod8674() {
		double var1 = this.method8685(); // L: 27
		return (int)Math.round((double)this.field4904 + (double)(this.field4907 - this.field4904) * var1); // L: 28
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1254922863"
	)
	public int vmethod8675() {
		double var1 = this.method8685(); // L: 32
		return (int)Math.round((double)this.field4903 + (double)(this.field4908 - this.field4903) * var1); // L: 33
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(CI)Z",
		garbageValue = "-1028387364"
	)
	public static final boolean method8666(char var0) {
		return var0 == 160 || var0 == ' ' || var0 == '_' || var0 == '-'; // L: 16
	}
}
