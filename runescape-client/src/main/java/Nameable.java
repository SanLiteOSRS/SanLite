import java.io.File;
import java.io.RandomAccessFile;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("lm")
@Implements("Nameable")
public class Nameable implements Comparable {
	@ObfuscatedName("bg")
	@ObfuscatedSignature(
		descriptor = "Lof;"
	)
	@Export("worldSelectRightSprite")
	static IndexedSprite worldSelectRightSprite;
	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "Lla;"
	)
	@Export("username")
	Username username;
	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "Lla;"
	)
	@Export("previousUsername")
	Username previousUsername;

	Nameable() {
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(Llm;B)I",
		garbageValue = "88"
	)
	@Export("compareTo_user")
	public int compareTo_user(Nameable var1) {
		return this.username.compareToTyped(var1.username);
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(I)Lla;",
		garbageValue = "2109048413"
	)
	@Export("getUsername")
	public Username getUsername() {
		return this.username;
	}

	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;",
		garbageValue = "-1818372907"
	)
	@Export("getName")
	public String getName() {
		return this.username == null ? "" : this.username.getName();
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;",
		garbageValue = "1375714428"
	)
	@Export("getPreviousName")
	public String getPreviousName() {
		return this.previousUsername == null ? "" : this.previousUsername.getName();
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(Lla;Lla;I)V",
		garbageValue = "-2074973533"
	)
	@Export("set")
	void set(Username var1, Username var2) {
		if (var1 == null) {
			throw new NullPointerException();
		} else {
			this.username = var1;
			this.previousUsername = var2;
		}
	}

	public int compareTo(Object var1) {
		return this.compareTo_user((Nameable)var1);
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(Ljava/io/File;ZB)Z",
		garbageValue = "-109"
	)
	@Export("isWriteable")
	static boolean isWriteable(File var0, boolean var1) {
		try {
			RandomAccessFile var2 = new RandomAccessFile(var0, "rw");
			int var3 = var2.read();
			var2.seek(0L);
			var2.write(var3);
			var2.seek(0L);
			var2.close();
			if (var1) {
				var0.delete();
			}

			return true;
		} catch (Exception var4) {
			return false;
		}
	}
}
