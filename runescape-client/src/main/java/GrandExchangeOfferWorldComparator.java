import java.util.Comparator;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jl")
@Implements("GrandExchangeOfferWorldComparator")
final class GrandExchangeOfferWorldComparator implements Comparator {
	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(Ljz;Ljz;I)I",
		garbageValue = "54151939"
	)
	@Export("compare_bridged")
	int compare_bridged(GrandExchangeEvent var1, GrandExchangeEvent var2) {
		return var1.world < var2.world ? -1 : (var2.world == var1.world ? 0 : 1);
	}

	public int compare(Object var1, Object var2) {
		return this.compare_bridged((GrandExchangeEvent)var1, (GrandExchangeEvent)var2);
	}

	public boolean equals(Object var1) {
		return super.equals(var1);
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(III)I",
		garbageValue = "-1109160711"
	)
	@Export("ItemContainer_getCount")
	static int ItemContainer_getCount(int var0, int var1) {
		ItemContainer var2 = (ItemContainer)ItemContainer.itemContainers.get((long)var0);
		if (var2 == null) {
			return 0;
		} else {
			return var1 >= 0 && var1 < var2.quantities.length ? var2.quantities[var1] : 0;
		}
	}

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(CI)Z",
		garbageValue = "-514625373"
	)
	@Export("isDigit")
	public static boolean isDigit(char var0) {
		return var0 >= '0' && var0 <= '9';
	}

	@ObfuscatedName("kq")
	@ObfuscatedSignature(
		descriptor = "(IIII)Lcl;",
		garbageValue = "-1358292624"
	)
	static final InterfaceParent method5010(int var0, int var1, int var2) {
		InterfaceParent var3 = new InterfaceParent();
		var3.group = var1;
		var3.type = var2;
		Client.interfaceParents.put(var3, (long)var0);
		ApproximateRouteStrategy.Widget_resetModelFrames(var1);
		Widget var4 = DevicePcmPlayerProvider.getWidget(var0);
		VerticalAlignment.invalidateWidget(var4);
		if (Client.meslayerContinueWidget != null) {
			VerticalAlignment.invalidateWidget(Client.meslayerContinueWidget);
			Client.meslayerContinueWidget = null;
		}

		GrandExchangeOfferOwnWorldComparator.method1212();
		ApproximateRouteStrategy.revalidateWidgetScroll(Widget.Widget_interfaceComponents[var0 >> 16], var4, false);
		HealthBar.runWidgetOnLoadListener(var1);
		if (Client.rootInterface != -1) {
			LoginType.runIntfCloseListeners(Client.rootInterface, 1);
		}

		return var3;
	}
}
