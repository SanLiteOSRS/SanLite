import java.io.File;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dc")
@Implements("UserComparator6")
public class UserComparator6 extends AbstractUserComparator {
	@ObfuscatedName("aj")
	static String field1340;
	@ObfuscatedName("bq")
	@ObfuscatedSignature(
		descriptor = "Loe;"
	)
	@Export("worldSelectLeftSprite")
	static IndexedSprite worldSelectLeftSprite;
	@ObfuscatedName("i")
	@Export("reversed")
	final boolean reversed;

	public UserComparator6(boolean var1) {
		this.reversed = var1;
	}

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(Lmt;Lmt;B)I",
		garbageValue = "1"
	)
	@Export("compareBuddy")
	int compareBuddy(Buddy var1, Buddy var2) {
		if (var1.world != 0 && var2.world != 0) {
			return this.reversed ? var1.getUsername().compareToTyped(var2.getUsername()) : var2.getUsername().compareToTyped(var1.getUsername());
		} else {
			return this.compareUser(var1, var2);
		}
	}

	public int compare(Object var1, Object var2) {
		return this.compareBuddy((Buddy)var1, (Buddy)var2);
	}

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1965177576"
	)
	static void method2513() {
		class300.field3765 = new int[2000];
		int var0 = 0;
		int var1 = 240;

		int var3;
		for (byte var2 = 12; var0 < 16; var1 -= var2) {
			var3 = SequenceDefinition.method3461((double)((float)var1 / 360.0F), 0.9998999834060669D, (double)(0.075F + 0.425F * (float)var0 / 16.0F));
			class300.field3765[var0] = var3;
			++var0;
		}

		var1 = 48;

		for (int var5 = var1 / 6; var0 < class300.field3765.length; var1 -= var5) {
			var3 = var0 * 2;

			for (int var4 = SequenceDefinition.method3461((double)((float)var1 / 360.0F), 0.9998999834060669D, 0.5D); var0 < var3 && var0 < class300.field3765.length; ++var0) {
				class300.field3765[var0] = var4;
			}
		}

	}

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(Ljava/io/File;I)V",
		garbageValue = "-1996074579"
	)
	static void method2508(File var0) {
		FileSystem.FileSystem_cacheDir = var0;
		if (!FileSystem.FileSystem_cacheDir.exists()) {
			throw new RuntimeException("");
		} else {
			FileSystem.FileSystem_hasPermissions = true;
		}
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(IB)I",
		garbageValue = "112"
	)
	public static int method2512(int var0) {
		return class361.field4047[var0 & 16383];
	}

	@ObfuscatedName("jk")
	@ObfuscatedSignature(
		descriptor = "(Ljf;IIB)V",
		garbageValue = "100"
	)
	@Export("clickWidget")
	static final void clickWidget(Widget var0, int var1, int var2) {
		if (Client.clickedWidget == null && !Client.isMenuOpen) {
			if (var0 != null) {
				Widget var4 = BuddyRankComparator.method2501(var0);
				if (var4 == null) {
					var4 = var0.parent;
				}

				if (var4 != null) {
					Client.clickedWidget = var0;
					var4 = BuddyRankComparator.method2501(var0);
					if (var4 == null) {
						var4 = var0.parent;
					}

					Client.clickedWidgetParent = var4;
					Client.widgetClickX = var1;
					Client.widgetClickY = var2;
					class134.widgetDragDuration = 0;
					Client.isDraggingWidget = false;
					int var6 = Client.menuOptionsCount - 1;
					if (var6 != -1) {
						class12.method170(var6);
					}

					return;
				}
			}

		}
	}

	@ObfuscatedName("ks")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1324364806"
	)
	static final void method2509() {
		Client.field681 = Client.cycleCntr;
		class29.field162 = true;
	}

	@ObfuscatedName("lr")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "1910834630"
	)
	static void method2503(int var0) {
		if (var0 != Client.loginState) {
			Client.loginState = var0;
		}
	}
}
