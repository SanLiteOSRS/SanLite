import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jv")
@Implements("VarcInt")
public class VarcInt extends DualNode {
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		signature = "Lir;"
	)
	@Export("VarcInt_archive")
	static AbstractArchive VarcInt_archive;
	@ObfuscatedName("o")
	@ObfuscatedSignature(
		signature = "Lgf;"
	)
	@Export("VarcInt_cached")
	static EvictingDualNodeHashTable VarcInt_cached;
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		signature = "Low;"
	)
	static IndexedSprite field3429;
	@ObfuscatedName("u")
	@Export("persist")
	public boolean persist;

	static {
		VarcInt_cached = new EvictingDualNodeHashTable(64);
	}

	VarcInt() {
		this.persist = false;
	}

	@ObfuscatedName("u")
	@ObfuscatedSignature(
		signature = "(Lnu;B)V",
		garbageValue = "-9"
	)
	void method4933(Buffer var1) {
		while (true) {
			int var2 = var1.readUnsignedByte();
			if (var2 == 0) {
				return;
			}

			this.method4934(var1, var2);
		}
	}

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		signature = "(Lnu;II)V",
		garbageValue = "635398124"
	)
	void method4934(Buffer var1, int var2) {
		if (var2 == 2) {
			this.persist = true;
		}

	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		signature = "([BIII)Ljava/lang/String;",
		garbageValue = "20641087"
	)
	public static String method4940(byte[] var0, int var1, int var2) {
		StringBuilder var3 = new StringBuilder();

		for (int var4 = var1; var4 < var2 + var1; var4 += 3) {
			int var5 = var0[var4] & 255;
			var3.append(class301.field3751[var5 >>> 2]);
			if (var4 < var2 - 1) {
				int var6 = var0[var4 + 1] & 255;
				var3.append(class301.field3751[(var5 & 3) << 4 | var6 >>> 4]);
				if (var4 < var2 - 2) {
					int var7 = var0[var4 + 2] & 255;
					var3.append(class301.field3751[(var6 & 15) << 2 | var7 >>> 6]).append(class301.field3751[var7 & 63]);
				} else {
					var3.append(class301.field3751[(var6 & 15) << 2]).append("=");
				}
			} else {
				var3.append(class301.field3751[(var5 & 3) << 4]).append("==");
			}
		}

		return var3.toString();
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		signature = "(ILcc;ZI)I",
		garbageValue = "-581975107"
	)
	static int method4941(int var0, Script var1, boolean var2) {
		if (var0 == 6900) {
			++Interpreter.Interpreter_stringStackSize;
			return 1;
		} else if (var0 == 6950) {
			++class16.Interpreter_intStackSize;
			return 1;
		} else {
			return 2;
		}
	}
}
