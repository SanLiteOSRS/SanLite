import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("la")
@Implements("Nameable")
public class Nameable implements Comparable {
	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "Lpb;"
	)
	@Export("username")
	Username username;
	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "Lpb;"
	)
	@Export("previousUsername")
	Username previousUsername;

	Nameable() {
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(Lla;I)I",
		garbageValue = "-1073614160"
	)
	@Export("compareTo_user")
	public int compareTo_user(Nameable var1) {
		return this.username.compareToTyped(var1.username);
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(I)Lpb;",
		garbageValue = "-1294008122"
	)
	@Export("getUsername")
	public Username getUsername() {
		return this.username;
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;",
		garbageValue = "598510100"
	)
	@Export("getName")
	public String getName() {
		return this.username == null ? "" : this.username.getName();
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(B)Ljava/lang/String;",
		garbageValue = "56"
	)
	@Export("getPreviousName")
	public String getPreviousName() {
		return this.previousUsername == null ? "" : this.previousUsername.getName();
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(Lpb;Lpb;I)V",
		garbageValue = "1723391677"
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
