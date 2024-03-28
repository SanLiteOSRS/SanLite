import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("rj")
@Implements("GraphicsDefaults")
public class GraphicsDefaults {
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = -191509293
	)
	public int field4851;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = -24180197
	)
	public int field4843;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = 17135311
	)
	public int field4842;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = -125252255
	)
	public int field4845;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = -1619634005
	)
	public int field4846;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = -1239483877
	)
	public int field4844;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = 380574345
	)
	public int field4848;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = 97624847
	)
	public int field4849;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = -1581329471
	)
	public int field4850;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = 1387626867
	)
	public int field4847;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = -1558813875
	)
	public int field4852;

	public GraphicsDefaults() {
		this.field4851 = -1; // L: 7
		this.field4843 = -1; // L: 8
		this.field4842 = -1; // L: 9
		this.field4845 = -1; // L: 10
		this.field4846 = -1; // L: 11
		this.field4844 = -1; // L: 12
		this.field4848 = -1; // L: 13
		this.field4849 = -1; // L: 14
		this.field4850 = -1; // L: 15
		this.field4847 = -1; // L: 16
		this.field4852 = -1; // L: 17
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(Loc;B)V",
		garbageValue = "-9"
	)
	@Export("decode")
	public void decode(AbstractArchive var1) {
		byte[] var2 = var1.takeFileFlat(DefaultsGroup.field4840.group); // L: 20
		Buffer var3 = new Buffer(var2); // L: 21

		while (true) {
			int var4 = var3.readUnsignedByte(); // L: 23
			if (var4 == 0) { // L: 24
				return; // L: 51
			}

			switch(var4) { // L: 25
			case 1:
				var3.readMedium(); // L: 28
				break;
			case 2:
				this.field4851 = var3.method9436(); // L: 36
				this.field4843 = var3.method9436(); // L: 37
				this.field4842 = var3.method9436(); // L: 38
				this.field4845 = var3.method9436(); // L: 39
				this.field4846 = var3.method9436(); // L: 40
				this.field4844 = var3.method9436(); // L: 41
				this.field4848 = var3.method9436(); // L: 42
				this.field4849 = var3.method9436(); // L: 43
				this.field4850 = var3.method9436(); // L: 44
				this.field4847 = var3.method9436(); // L: 45
				this.field4852 = var3.method9436(); // L: 46
			}
		}
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "([BI)[I",
		garbageValue = "893721568"
	)
	public static int[] method8340(byte[] var0) {
		if (var0 != null && var0.length != 0 && var0.length <= 8) { // L: 164
			int[] var1 = new int[var0.length]; // L: 167

			for (int var2 = 0; var2 < var0.length; ++var2) { // L: 168
				if (var0[var2] < 0 || var0[var2] > class558.field5385.length) { // L: 169
					return null; // L: 170
				}

				var1[var2] = class558.field5385[var0[var2]]; // L: 172
			}

			return var1; // L: 174
		} else {
			return null; // L: 165
		}
	}
}
