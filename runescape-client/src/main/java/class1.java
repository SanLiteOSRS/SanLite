import java.io.File;
import java.io.RandomAccessFile;
import java.util.concurrent.Callable;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("h")
public class class1 implements Callable {
	@ObfuscatedName("sm")
	@ObfuscatedSignature(
		descriptor = "Lqn;"
	)
	@Export("sceneMinimapSprite")
	static SpritePixels sceneMinimapSprite;
	@ObfuscatedName("mz")
	@ObfuscatedGetter(
		intValue = -1008403491
	)
	@Export("menuY")
	static int menuY;
	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "Lqr;"
	)
	final Buffer field9;
	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "Lv;"
	)
	final class3 field0;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lk;"
	)
	final class7 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lk;Lqr;Lv;)V"
	)
	class1(class7 var1, Buffer var2, class3 var3) {
		this.this$0 = var1; // L: 47
		this.field9 = var2; // L: 48
		this.field0 = var3; // L: 49
	} // L: 50

	public Object call() {
		return this.field0.vmethod12(this.field9); // L: 54
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)Ljava/io/File;",
		garbageValue = "-1454847961"
	)
	@Export("getFile")
	static File getFile(String var0) {
		if (!FileSystem.FileSystem_hasPermissions) { // L: 16
			throw new RuntimeException("");
		} else {
			File var1 = (File)FileSystem.FileSystem_cacheFiles.get(var0); // L: 17
			if (var1 != null) { // L: 18
				return var1;
			} else {
				File var2 = new File(FileSystem.FileSystem_cacheDir, var0); // L: 19
				RandomAccessFile var3 = null; // L: 20

				try {
					File var4 = new File(var2.getParent()); // L: 22
					if (!var4.exists()) { // L: 23
						throw new RuntimeException("");
					} else {
						var3 = new RandomAccessFile(var2, "rw"); // L: 24
						int var5 = var3.read(); // L: 25
						var3.seek(0L); // L: 26
						var3.write(var5); // L: 27
						var3.seek(0L); // L: 28
						var3.close(); // L: 29
						FileSystem.FileSystem_cacheFiles.put(var0, var2); // L: 30
						return var2; // L: 31
					}
				} catch (Exception var8) {
					try {
						if (var3 != null) { // L: 35
							var3.close(); // L: 36
							var3 = null; // L: 37
						}
					} catch (Exception var7) { // L: 40
					}

					throw new RuntimeException(); // L: 42
				}
			}
		}
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-43"
	)
	public static void method7() {
		if (NetCache.NetCache_socket != null) { // L: 245
			NetCache.NetCache_socket.close();
		}

	} // L: 246

	@ObfuscatedName("la")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1880349412"
	)
	static void method10() {
		FriendsChatMember.clientPreferences.method2228(Client.field480); // L: 12265
	} // L: 12266
}
