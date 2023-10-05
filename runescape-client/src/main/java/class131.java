import java.io.IOException;
import java.util.concurrent.Callable;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fh")
public class class131 implements Callable {
	@ObfuscatedName("ur")
	@ObfuscatedGetter(
		intValue = 388777361
	)
	static int field1535;
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Lfz;"
	)
	final class132 field1534;
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Lfs;"
	)
	final class133 field1532;
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Lfl;"
	)
	final class134 field1531;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = 706977805
	)
	final int field1536;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lfk;"
	)
	final class139 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lfk;Lfz;Lfs;Lfl;I)V"
	)
	class131(class139 var1, class132 var2, class133 var3, class134 var4, int var5) {
		this.this$0 = var1; // L: 229
		this.field1534 = var2; // L: 230
		this.field1532 = var3; // L: 231
		this.field1531 = var4; // L: 232
		this.field1536 = var5; // L: 233
	} // L: 234

	public Object call() {
		this.field1534.method3021(); // L: 238
		class132[][] var1;
		if (this.field1532 == class133.field1569) { // L: 240
			var1 = this.this$0.field1610; // L: 241
		} else {
			var1 = this.this$0.field1603; // L: 244
		}

		var1[this.field1536][this.field1531.method3067()] = this.field1534; // L: 246
		return null; // L: 247
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(B)[B",
		garbageValue = "1"
	)
	public static byte[] method3015() {
		byte[] var0 = new byte[24]; // L: 325

		try {
			JagexCache.JagexCache_randomDat.seek(0L); // L: 327
			JagexCache.JagexCache_randomDat.readFully(var0); // L: 328

			int var1;
			for (var1 = 0; var1 < 24 && var0[var1] == 0; ++var1) { // L: 329 330 331
			}

			if (var1 >= 24) {
				throw new IOException(); // L: 333
			}
		} catch (Exception var4) {
			for (int var2 = 0; var2 < 24; ++var2) { // L: 336
				var0[var2] = -1;
			}
		}

		return var0; // L: 338
	}

	@ObfuscatedName("mu")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "1460663579"
	)
	static boolean method3016(int var0) {
		for (int var1 = 0; var1 < Client.field757; ++var1) { // L: 11977
			if (Client.field759[var1] == var0) { // L: 11978
				return true;
			}
		}

		return false; // L: 11980
	}
}
