import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("lt")
@Implements("Nameable")
public class Nameable implements Comparable {
	@ObfuscatedName("u")
	@ObfuscatedSignature(
		signature = "Llw;"
	)
	@Export("username")
	Username username;
	@ObfuscatedName("p")
	@ObfuscatedSignature(
		signature = "Llw;"
	)
	@Export("previousUsername")
	Username previousUsername;

	Nameable() {
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		signature = "(Llt;I)I",
		garbageValue = "1200801892"
	)
	@Export("compareTo_user")
	public int compareTo_user(Nameable var1) {
		return this.username.compareToTyped(var1.username);
	}

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		signature = "(B)Llw;",
		garbageValue = "46"
	)
	@Export("getUsername")
	public Username getUsername() {
		return this.username;
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		signature = "(I)Ljava/lang/String;",
		garbageValue = "125310743"
	)
	@Export("getName")
	public String getName() {
		return this.username == null ? "" : this.username.getName();
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		signature = "(B)Ljava/lang/String;",
		garbageValue = "-43"
	)
	@Export("getPreviousName")
	public String getPreviousName() {
		return this.previousUsername == null ? "" : this.previousUsername.getName();
	}

	@ObfuscatedName("y")
	@ObfuscatedSignature(
		signature = "(Llw;Llw;B)V",
		garbageValue = "-36"
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
}
