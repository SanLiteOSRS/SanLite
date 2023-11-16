import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("rf")
@Implements("Nameable")
public class Nameable implements Comparable {
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "Lvj;"
	)
	@Export("username")
	Username username;
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Lvj;"
	)
	@Export("previousUsername")
	Username previousUsername;

	Nameable() {
	} // L: 9

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(Lrf;B)I",
		garbageValue = "-95"
	)
	@Export("compareTo_user")
	public int compareTo_user(Nameable var1) {
		return this.username.compareToTyped(var1.username); // L: 32
	}

	@ObfuscatedName("be")
	@ObfuscatedSignature(
		descriptor = "(I)Lvj;",
		garbageValue = "-1855232108"
	)
	@Export("getUsername")
	public Username getUsername() {
		return this.username; // L: 12
	}

	@ObfuscatedName("bd")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;",
		garbageValue = "1231899353"
	)
	@Export("getName")
	public String getName() {
		return this.username == null ? "" : this.username.getName(); // L: 16 17
	}

	@ObfuscatedName("bl")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;",
		garbageValue = "52965911"
	)
	@Export("getPreviousName")
	public String getPreviousName() {
		return this.previousUsername == null ? "" : this.previousUsername.getName(); // L: 21 22
	}

	@ObfuscatedName("bi")
	@ObfuscatedSignature(
		descriptor = "(Lvj;Lvj;B)V",
		garbageValue = "16"
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

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Lol;Lol;S)I",
		garbageValue = "-21186"
	)
	static int method8164(AbstractArchive var0, AbstractArchive var1) {
		int var2 = 0; // L: 168
		String[] var3 = Login.field895; // L: 170

		int var4;
		String var5;
		for (var4 = 0; var4 < var3.length; ++var4) { // L: 171
			var5 = var3[var4]; // L: 172
			if (var0.tryLoadFileByNames(var5, "")) { // L: 174
				++var2; // L: 175
			}
		}

		var3 = Login.field930; // L: 181

		for (var4 = 0; var4 < var3.length; ++var4) { // L: 182
			var5 = var3[var4]; // L: 183
			if (var1.tryLoadFileByNames(var5, "")) { // L: 185
				++var2; // L: 186
			}
		}

		var3 = Login.field932; // L: 192

		for (var4 = 0; var4 < var3.length; ++var4) { // L: 193
			var5 = var3[var4]; // L: 194
			if (var1.getGroupId(var5) != -1 && var1.tryLoadFileByNames(var5, "")) { // L: 196
				++var2; // L: 197
			}
		}

		return var2; // L: 202
	}
}
