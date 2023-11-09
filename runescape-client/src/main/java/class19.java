import java.util.concurrent.Future;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("v")
public class class19 {
	@ObfuscatedName("he")
	@Export("regionLandArchiveIds")
	static int[] regionLandArchiveIds;
	@ObfuscatedName("o")
	Future field107;
	@ObfuscatedName("q")
	String field104;

	class19(Future var1) {
		this.field107 = var1; // L: 10
	} // L: 11

	class19(String var1) {
		this.method276(var1); // L: 14
	} // L: 15

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "1864207800"
	)
	void method276(String var1) {
		if (var1 == null) { // L: 18
			var1 = "";
		}

		this.field104 = var1; // L: 19
		if (this.field107 != null) { // L: 20
			this.field107.cancel(true); // L: 21
			this.field107 = null; // L: 22
		}

	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(B)Ljava/lang/String;",
		garbageValue = "-100"
	)
	public final String method280() {
		return this.field104;
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-442726183"
	)
	public boolean method277() {
		return this.field104 != null || this.field107 == null;
	}

	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1331105241"
	)
	public final boolean method278() {
		return this.method277() ? true : this.field107.isDone(); // L: 35 36
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(B)Le;",
		garbageValue = "62"
	)
	public final class21 method279() {
		if (this.method277()) { // L: 40
			return new class21(this.field104);
		} else if (!this.method278()) {
			return null; // L: 41
		} else {
			try {
				return (class21)this.field107.get(); // L: 43
			} catch (Exception var3) { // L: 45
				String var2 = "Error retrieving REST request reply"; // L: 46
				System.err.println(var2 + "\r\n" + var3); // L: 47
				this.method276(var2); // L: 48
				return new class21(var2); // L: 49
			}
		}
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(II)Lkf;",
		garbageValue = "-4614059"
	)
	public static GameBuild method290(int var0) {
		GameBuild[] var1 = class240.method4992(); // L: 23

		for (int var2 = 0; var2 < var1.length; ++var2) { // L: 24
			GameBuild var3 = var1[var2]; // L: 25
			if (var0 == var3.buildId) {
				return var3; // L: 27
			}
		}

		return null; // L: 31
	}

	@ObfuscatedName("ko")
	@ObfuscatedSignature(
		descriptor = "(Lku;III)V",
		garbageValue = "-1770061963"
	)
	@Export("clickWidget")
	static final void clickWidget(Widget var0, int var1, int var2) {
		if (Client.clickedWidget == null && !Client.isMenuOpen) { // L: 11511
			if (var0 != null) { // L: 11513
				Widget var5 = var0; // L: 11517
				int var7 = class67.getWidgetFlags(var0); // L: 11520
				int var6 = var7 >> 17 & 7; // L: 11522
				int var8 = var6; // L: 11524
				Widget var4;
				int var9;
				if (var6 == 0) { // L: 11525
					var4 = null; // L: 11526
				} else {
					var9 = 0;

					while (true) {
						if (var9 >= var8) {
							var4 = var5; // L: 11536
							break;
						}

						var5 = FloorUnderlayDefinition.getWidget(var5.parentId); // L: 11530
						if (var5 == null) { // L: 11531
							var4 = null; // L: 11532
							break; // L: 11533
						}

						++var9; // L: 11529
					}
				}

				Widget var10 = var4; // L: 11538
				if (var4 == null) { // L: 11539
					var10 = var0.parent;
				}

				if (var10 != null) { // L: 11542
					Client.clickedWidget = var0; // L: 11546
					var5 = var0; // L: 11550
					var7 = class67.getWidgetFlags(var0); // L: 11553
					var6 = var7 >> 17 & 7; // L: 11555
					var8 = var6; // L: 11557
					if (var6 == 0) { // L: 11558
						var4 = null; // L: 11559
					} else {
						var9 = 0;

						while (true) {
							if (var9 >= var8) {
								var4 = var5; // L: 11569
								break;
							}

							var5 = FloorUnderlayDefinition.getWidget(var5.parentId); // L: 11563
							if (var5 == null) { // L: 11564
								var4 = null; // L: 11565
								break; // L: 11566
							}

							++var9; // L: 11562
						}
					}

					var10 = var4; // L: 11571
					if (var4 == null) { // L: 11572
						var10 = var0.parent;
					}

					Client.clickedWidgetParent = var10; // L: 11575
					Client.widgetClickX = var1; // L: 11576
					Client.widgetClickY = var2; // L: 11577
					LoginScreenAnimation.widgetDragDuration = 0; // L: 11578
					Client.isDraggingWidget = false; // L: 11579
					int var11 = Player.method2211(); // L: 11580
					if (var11 != -1) { // L: 11581
						class113.method2713(var11);
					}

					return; // L: 11582
				}
			}

		}
	} // L: 11544
}
