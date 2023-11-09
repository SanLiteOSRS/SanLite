import java.io.IOException;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("oa")
public class class383 {
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Loq;"
	)
	class379 field4457;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = -816892485
	)
	int field4454;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = 987221129
	)
	int field4455;

	@ObfuscatedSignature(
		descriptor = "(Loq;II)V"
	)
	class383(class379 var1, int var2, int var3) {
		this.field4454 = 0; // L: 7
		this.field4455 = 0; // L: 8
		this.field4457 = var1; // L: 11
		this.field4454 = var2; // L: 12
		this.field4455 = var3; // L: 13
	} // L: 14

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;",
		garbageValue = "-48485402"
	)
	public String method7522() {
		if (this.method7513()) { // L: 17
			return "";
		} else {
			StringBuilder var1 = new StringBuilder(this.method7514()); // L: 18

			for (int var2 = this.field4454; var2 < this.field4455; ++var2) { // L: 19
				class381 var3 = this.field4457.method7260(var2); // L: 20
				var1.append(var3.field4428); // L: 21
			}

			return var1.toString(); // L: 23
		}
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "1783943189"
	)
	boolean method7516(int var1) {
		return this.field4457.method7291() == 2 || this.field4457.method7291() == 1 && (!this.field4457.field4415 || this.field4455 - 1 != var1); // L: 27
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "791000990"
	)
	public boolean method7513() {
		return this.field4455 == this.field4454; // L: 31
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "87"
	)
	public int method7514() {
		return this.field4455 - this.field4454; // L: 35
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(Lom;I)Z",
		garbageValue = "-2138550127"
	)
	boolean method7521(class381 var1) {
		if (this.field4457.field4419 == 2) { // L: 39
			return true;
		} else if (this.field4457.field4419 == 0) { // L: 40
			return false;
		} else {
			return this.field4457.method7290() != var1; // L: 41
		}
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-2139094912"
	)
	int method7524() {
		if (this.method7513()) { // L: 46
			return 0;
		} else {
			class381 var1 = this.field4457.method7260(this.field4455 - 1); // L: 47
			if (var1.field4428 == '\n') { // L: 48
				return 0;
			} else if (this.method7521(var1)) {
				return this.field4457.field4409.advances[42]; // L: 49
			} else {
				int var2 = this.field4457.field4409.advances[var1.field4428]; // L: 50
				if (var2 == 0) { // L: 51
					return var1.field4428 == '\t' ? this.field4457.field4409.advances[32] * 3 : this.field4457.field4409.advances[32]; // L: 52 53 56
				} else {
					return var2; // L: 60
				}
			}
		}
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(B)Lrg;",
		garbageValue = "5"
	)
	public class461 method7512() {
		if (this.method7513()) { // L: 65
			return new class461(0, 0); // L: 66
		} else {
			class381 var1 = this.field4457.method7260(this.field4455 - 1);
			return new class461(var1.field4427 + this.method7524(), var1.field4430); // L: 69
		}
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(II)Lom;",
		garbageValue = "-1037292745"
	)
	public class381 method7515(int var1) {
		return var1 >= 0 && var1 < this.method7514() ? this.field4457.method7260(this.field4454 + var1) : null; // L: 73 74
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(II)Ljava/lang/String;",
		garbageValue = "-1607388222"
	)
	@Export("colorStartTag")
	static String colorStartTag(int var0) {
		return "<col=" + Integer.toHexString(var0) + ">"; // L: 22
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1054245173"
	)
	public static void method7542() {
		class481.DBTableType_cache.clear(); // L: 67
	} // L: 68

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(IIB)I",
		garbageValue = "119"
	)
	static final int method7540(int var0, int var1) {
		int var2 = Actor.method2398(var0 - 1, var1 - 1) + Actor.method2398(1 + var0, var1 - 1) + Actor.method2398(var0 - 1, var1 + 1) + Actor.method2398(1 + var0, 1 + var1); // L: 1027
		int var3 = Actor.method2398(var0 - 1, var1) + Actor.method2398(var0 + 1, var1) + Actor.method2398(var0, var1 - 1) + Actor.method2398(var0, var1 + 1); // L: 1028
		int var4 = Actor.method2398(var0, var1); // L: 1029
		return var2 / 16 + var3 / 8 + var4 / 4; // L: 1030
	}

	@ObfuscatedName("nj")
	@ObfuscatedSignature(
		descriptor = "(Lsg;B)V",
		garbageValue = "23"
	)
	static void method7541(Buffer var0) {
		if (Client.randomDatData != null) { // L: 12144
			var0.writeBytes(Client.randomDatData, 0, Client.randomDatData.length); // L: 12145
		} else {
			byte[] var2 = new byte[24]; // L: 12150

			try {
				JagexCache.JagexCache_randomDat.seek(0L); // L: 12152
				JagexCache.JagexCache_randomDat.readFully(var2); // L: 12153

				int var3;
				for (var3 = 0; var3 < 24 && var2[var3] == 0; ++var3) { // L: 12154 12155 12156
				}

				if (var3 >= 24) { // L: 12158
					throw new IOException();
				}
			} catch (Exception var6) {
				for (int var4 = 0; var4 < 24; ++var4) { // L: 12161
					var2[var4] = -1;
				}
			}

			var0.writeBytes(var2, 0, var2.length); // L: 12166
		}
	} // L: 12146 12167
}
