import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jh")
@Implements("Nameable")
public class Nameable implements Comparable {
	@ObfuscatedName("l")
	@ObfuscatedSignature(
		signature = "Lkm;"
	)
	@Export("username")
	Username username;
	@ObfuscatedName("m")
	@ObfuscatedSignature(
		signature = "Lkm;"
	)
	@Export("previousUsername")
	Username previousUsername;

	Nameable() {
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		signature = "(I)Lkm;",
		garbageValue = "-335278145"
	)
	@Export("getUsername")
	public Username getUsername() {
		return this.username;
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		signature = "(I)Ljava/lang/String;",
		garbageValue = "-1574764800"
	)
	@Export("getName")
	public String getName() {
		return this.username == null ? "" : this.username.getName();
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		signature = "(I)Ljava/lang/String;",
		garbageValue = "198172856"
	)
	@Export("getPreviousName")
	public String getPreviousName() {
		return this.previousUsername == null ? "" : this.previousUsername.getName();
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		signature = "(Lkm;Lkm;I)V",
		garbageValue = "208802745"
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

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		signature = "(Ljh;B)I",
		garbageValue = "69"
	)
	@Export("compareTo_user")
	public int compareTo_user(Nameable var1) {
		return this.username.compareToTyped(var1.username);
	}

	public int compareTo(Object var1) {
		return this.compareTo_user((Nameable)var1);
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		signature = "(S)J",
		garbageValue = "17738"
	)
	@Export("currentTimeMillis")
	public static final synchronized long currentTimeMillis() {
		long var0 = System.currentTimeMillis();
		if (var0 < ArchiveLoader.field565) {
			class307.field3731 += ArchiveLoader.field565 - var0;
		}

		ArchiveLoader.field565 = var0;
		return class307.field3731 + var0;
	}
}
