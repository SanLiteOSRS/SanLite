import java.io.File;
import java.io.RandomAccessFile;
import java.util.concurrent.Callable;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ez")
public class class126 implements Callable {
	@ObfuscatedName("as")
	public static short[][] field1495;
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Lew;"
	)
	final class127 field1494;
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Leu;"
	)
	final class128 field1491;
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Led;"
	)
	final class129 field1493;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = -420043691
	)
	final int field1492;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lfl;"
	)
	final class134 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lfl;Lew;Leu;Led;I)V"
	)
	class126(class134 var1, class127 var2, class128 var3, class129 var4, int var5) {
		this.this$0 = var1; // L: 259
		this.field1494 = var2; // L: 260
		this.field1491 = var3; // L: 261
		this.field1493 = var4; // L: 262
		this.field1492 = var5; // L: 263
	} // L: 264

	public Object call() {
		this.field1494.method2995(); // L: 268
		class127[][] var1;
		if (this.field1491 == class128.field1534) { // L: 270
			var1 = this.this$0.field1575; // L: 271
		} else {
			var1 = this.this$0.field1568; // L: 274
		}

		var1[this.field1492][this.field1493.method3017()] = this.field1494; // L: 276
		return null; // L: 277
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(Ljava/io/File;I)V",
		garbageValue = "-818218620"
	)
	static void method2965(File var0) {
		FileSystem.FileSystem_cacheDir = var0; // L: 16
		if (!FileSystem.FileSystem_cacheDir.exists()) { // L: 17
			throw new RuntimeException("");
		} else {
			FileSystem.FileSystem_hasPermissions = true; // L: 18
		}
	} // L: 19

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Object;ZI)[B",
		garbageValue = "112300404"
	)
	public static byte[] method2966(Object var0, boolean var1) {
		if (var0 == null) {
			return null;
		} else if (var0 instanceof byte[]) {
			byte[] var6 = (byte[])((byte[])var0);
			if (var1) {
				int var4 = var6.length;
				byte[] var5 = new byte[var4];
				System.arraycopy(var6, 0, var5, 0, var4); // L: 38
				return var5;
			} else {
				return var6;
			}
		} else if (var0 instanceof AbstractByteArrayCopier) { // L: 45
			AbstractByteArrayCopier var2 = (AbstractByteArrayCopier)var0;
			return var2.get(); // L: 47
		} else {
			throw new IllegalArgumentException(); // L: 49
		}
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)Ljava/io/File;",
		garbageValue = "-1808711243"
	)
	@Export("getFile")
	static File getFile(String var0) {
		if (!FileSystem.FileSystem_hasPermissions) { // L: 22
			throw new RuntimeException("");
		} else {
			File var1 = (File)FileSystem.FileSystem_cacheFiles.get(var0); // L: 23
			if (var1 != null) { // L: 24
				return var1;
			} else {
				File var2 = new File(FileSystem.FileSystem_cacheDir, var0); // L: 25
				RandomAccessFile var3 = null; // L: 26

				try {
					File var4 = new File(var2.getParent()); // L: 28
					if (!var4.exists()) { // L: 29
						throw new RuntimeException("");
					} else {
						var3 = new RandomAccessFile(var2, "rw"); // L: 30
						int var5 = var3.read(); // L: 31
						var3.seek(0L); // L: 32
						var3.write(var5); // L: 33
						var3.seek(0L); // L: 34
						var3.close(); // L: 35
						FileSystem.FileSystem_cacheFiles.put(var0, var2); // L: 36
						return var2; // L: 37
					}
				} catch (Exception var8) {
					try {
						if (var3 != null) { // L: 41
							var3.close(); // L: 42
							var3 = null; // L: 43
						}
					} catch (Exception var7) { // L: 46
					}

					throw new RuntimeException(); // L: 48
				}
			}
		}
	}

	@ObfuscatedName("nq")
	@ObfuscatedSignature(
		descriptor = "(II)Lst;",
		garbageValue = "311737350"
	)
	static class471 method2968(int var0) {
		class471 var1 = (class471)Client.Widget_cachedModels.get((long)var0); // L: 12254
		if (var1 == null) { // L: 12255
			var1 = new class471(class320.field3708, class36.method674(var0), GameObject.method4778(var0)); // L: 12256
			Client.Widget_cachedModels.put(var1, (long)var0); // L: 12257
		}

		return var1; // L: 12259
	}
}
