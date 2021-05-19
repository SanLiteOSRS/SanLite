import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("la")
@Implements("Username")
public class Username implements Comparable {
	@ObfuscatedName("h")
	@Export("name")
	String name;
	@ObfuscatedName("c")
	@Export("cleanName")
	String cleanName;

	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Lnj;)V"
	)
	public Username(String var1, LoginType var2) {
		this.name = var1;
		String var4;
		if (var1 == null) {
			var4 = null;
		} else {
			int var5 = 0;

			int var6;
			boolean var7;
			char var8;
			for (var6 = var1.length(); var5 < var6; ++var5) {
				var8 = var1.charAt(var5);
				var7 = var8 == 160 || var8 == ' ' || var8 == '_' || var8 == '-';
				if (!var7) {
					break;
				}
			}

			while (var6 > var5) {
				var8 = var1.charAt(var6 - 1);
				var7 = var8 == 160 || var8 == ' ' || var8 == '_' || var8 == '-';
				if (!var7) {
					break;
				}

				--var6;
			}

			int var13 = var6 - var5;
			if (var13 >= 1 && var13 <= UserComparator5.method2463(var2)) {
				StringBuilder var12 = new StringBuilder(var13);

				for (int var9 = var5; var9 < var6; ++var9) {
					char var10 = var1.charAt(var9);
					if (class310.method5484(var10)) {
						char var11 = class5.method68(var10);
						if (var11 != 0) {
							var12.append(var11);
						}
					}
				}

				if (var12.length() == 0) {
					var4 = null;
				} else {
					var4 = var12.toString();
				}
			} else {
				var4 = null;
			}
		}

		this.cleanName = var4;
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;",
		garbageValue = "391348428"
	)
	@Export("getName")
	public String getName() {
		return this.name;
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "1"
	)
	@Export("hasCleanName")
	public boolean hasCleanName() {
		return this.cleanName != null;
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(Lla;B)I",
		garbageValue = "-53"
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

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(Ljp;III)Z",
		garbageValue = "-1294784382"
	)
	public static boolean method5711(AbstractArchive var0, int var1, int var2) {
		byte[] var3 = var0.takeFile(var1, var2);
		if (var3 == null) {
			return false;
		} else {
			class303.SpriteBuffer_decode(var3);
			return true;
		}
	}
}
