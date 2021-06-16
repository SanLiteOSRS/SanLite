import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("lc")
@Implements("Username")
public class Username implements Comparable {
	@ObfuscatedName("f")
	@Export("name")
	String name;
	@ObfuscatedName("e")
	@Export("cleanName")
	String cleanName;

	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Lnb;)V"
	)
	public Username(String var1, LoginType var2) {
		this.name = var1;
		String var4;
		if (var1 == null) {
			var4 = null;
		} else {
			int var5 = 0;

			int var6;
			for (var6 = var1.length(); var5 < var6 && SpriteMask.method4777(var1.charAt(var5)); ++var5) {
			}

			while (var6 > var5 && SpriteMask.method4777(var1.charAt(var6 - 1))) {
				--var6;
			}

			int var7 = var6 - var5;
			if (var7 >= 1 && var7 <= Friend.method5773(var2)) {
				StringBuilder var8 = new StringBuilder(var7);

				for (int var9 = var5; var9 < var6; ++var9) {
					char var10 = var1.charAt(var9);
					if (Client.method1746(var10)) {
						char var11 = WorldMapElement.method2732(var10);
						if (var11 != 0) {
							var8.append(var11);
						}
					}
				}

				if (var8.length() == 0) {
					var4 = null;
				} else {
					var4 = var8.toString();
				}
			} else {
				var4 = null;
			}
		}

		this.cleanName = var4;
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(B)Ljava/lang/String;",
		garbageValue = "-55"
	)
	@Export("getName")
	public String getName() {
		return this.name;
	}

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "1"
	)
	@Export("hasCleanName")
	public boolean hasCleanName() {
		return this.cleanName != null;
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(Llc;I)I",
		garbageValue = "-928498828"
	)
	@Export("compareToTyped")
	public int compareToTyped(Username var1) {
		if (this.cleanName == null) {
			return var1.cleanName == null ? 0 : 1;
		} else {
			return var1.cleanName == null ? -1 : this.cleanName.compareTo(var1.cleanName);
		}
	}

	public boolean equals(Object var1) {
		if (var1 instanceof Username) {
			Username var2 = (Username)var1;
			if (this.cleanName == null) {
				return var2.cleanName == null;
			} else if (var2.cleanName == null) {
				return false;
			} else {
				return this.hashCode() != var2.hashCode() ? false : this.cleanName.equals(var2.cleanName);
			}
		} else {
			return false;
		}
	}

	public int hashCode() {
		return this.cleanName == null ? 0 : this.cleanName.hashCode();
	}

	public String toString() {
		return this.getName();
	}

	public int compareTo(Object var1) {
		return this.compareToTyped((Username)var1);
	}
}
