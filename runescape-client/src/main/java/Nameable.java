import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("qe")
@Implements("Nameable")
public class Nameable implements Comparable {
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "Lui;"
	)
	@Export("username")
	Username username;
	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "Lui;"
	)
	@Export("previousUsername")
	Username previousUsername;

	Nameable() {
	} // L: 9

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(Lqe;B)I",
		garbageValue = "114"
	)
	@Export("compareTo_user")
	public int compareTo_user(Nameable var1) {
		return this.username.compareToTyped(var1.username); // L: 32
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(I)Lui;",
		garbageValue = "-157442645"
	)
	@Export("getUsername")
	public Username getUsername() {
		return this.username; // L: 12
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(B)Ljava/lang/String;",
		garbageValue = "7"
	)
	@Export("getName")
	public String getName() {
		return this.username == null ? "" : this.username.getName(); // L: 16 17
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(B)Ljava/lang/String;",
		garbageValue = "8"
	)
	@Export("getPreviousName")
	public String getPreviousName() {
		return this.previousUsername == null ? "" : this.previousUsername.getName(); // L: 21 22
	}

	@ObfuscatedName("bd")
	@ObfuscatedSignature(
		descriptor = "(Lui;Lui;I)V",
		garbageValue = "-1440171953"
	)
	@Export("set")
	void set(Username var1, Username var2) {
		if (var1 == null) { // L: 26
			throw new NullPointerException();
		} else {
			this.username = var1; // L: 27
			this.previousUsername = var2; // L: 28
		}
	} // L: 29

	public int compareTo(Object var1) {
		return this.compareTo_user((Nameable)var1); // L: 36
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "15"
	)
	static void method7972() {
		try {
			File var0 = new File(Bounds.userHomeDirectory, "random.dat"); // L: 296
			int var2;
			if (var0.exists()) { // L: 297
				JagexCache.JagexCache_randomDat = new BufferedFile(new AccessFile(var0, "rw", 25L), 24, 0); // L: 298
			} else {
				label38:
				for (int var1 = 0; var1 < ByteArrayPool.field4541.length; ++var1) { // L: 301
					for (var2 = 0; var2 < class157.field1745.length; ++var2) { // L: 302
						File var3 = new File(class157.field1745[var2] + ByteArrayPool.field4541[var1] + File.separatorChar + "random.dat"); // L: 303
						if (var3.exists()) { // L: 304
							JagexCache.JagexCache_randomDat = new BufferedFile(new AccessFile(var3, "rw", 25L), 24, 0); // L: 305
							break label38; // L: 306
						}
					}
				}
			}

			if (JagexCache.JagexCache_randomDat == null) { // L: 311
				RandomAccessFile var4 = new RandomAccessFile(var0, "rw"); // L: 312
				var2 = var4.read(); // L: 313
				var4.seek(0L); // L: 314
				var4.write(var2); // L: 315
				var4.seek(0L); // L: 316
				var4.close(); // L: 317
				JagexCache.JagexCache_randomDat = new BufferedFile(new AccessFile(var0, "rw", 25L), 24, 0); // L: 318
			}
		} catch (IOException var5) { // L: 321
		}

	} // L: 322
}
