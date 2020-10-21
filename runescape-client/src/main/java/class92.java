import java.io.IOException;
import java.math.BigInteger;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cq")
public class class92 {
	@ObfuscatedName("f")
	static final BigInteger field1198;
	@ObfuscatedName("b")
	static final BigInteger field1197;

	static {
		field1198 = new BigInteger("10001", 16);
		field1197 = new BigInteger("a06bfdd9568298f630b8bd054ad4e6672231dffed57b38134e601756fa2a3443a6f0b423799b2d930bdc4c4213e63731504e130f4b4b1d5b21c8327e3f188eb1be3d8c1eca5ebe82c769bf3ef14b288fdd291fc951e5547262f62c171254701308d6106038c718cd10d503c59d12a4ed849a8eb4b3fae3f15212e22ae4918a4f", 16);
	}

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		signature = "(B)[B",
		garbageValue = "60"
	)
	public static byte[] method2172() {
		byte[] var0 = new byte[24];

		try {
			JagexCache.JagexCache_randomDat.seek(0L);
			JagexCache.JagexCache_randomDat.readFully(var0);

			int var1;
			for (var1 = 0; var1 < 24 && var0[var1] == 0; ++var1) {
			}

			if (var1 >= 24) {
				throw new IOException();
			}
		} catch (Exception var4) {
			for (int var2 = 0; var2 < 24; ++var2) {
				var0[var2] = -1;
			}
		}

		return var0;
	}
}
