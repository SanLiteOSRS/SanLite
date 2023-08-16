import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("qe")
public class class416 {
	@ObfuscatedName("ag")
	@Export("ByteArrayPool_alternativeSizes")
	static int[] ByteArrayPool_alternativeSizes;

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V",
		garbageValue = "-1333151916"
	)
	@Export("addChatMessage")
	static void addChatMessage(int var0, String var1, String var2, String var3) {
		ChatChannel var4 = (ChatChannel)Messages.Messages_channels.get(var0); // L: 23
		if (var4 == null) { // L: 24
			var4 = new ChatChannel(); // L: 25
			Messages.Messages_channels.put(var0, var4); // L: 26
		}

		Message var5 = var4.addMessage(var0, var1, var2, var3); // L: 28
		Messages.Messages_hashTable.put(var5, (long)var5.count); // L: 29
		Messages.Messages_queue.add(var5); // L: 30
		Client.chatCycle = Client.cycleCntr; // L: 31
	} // L: 32

	@ObfuscatedName("ia")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "-2143808168"
	)
	static final void method7711(int var0, int var1) {
		if (var0 < 128) { // L: 3807
			var0 = 128; // L: 3808
		} else if (var0 > 383) { // L: 3810
			var0 = 383; // L: 3811
		}

		if (class129.cameraPitch < var0) { // L: 3813
			class129.cameraPitch = (var0 - class129.cameraPitch) * WorldMapElement.field1963 / 1000 + class129.cameraPitch + class33.field188; // L: 3814
			if (class129.cameraPitch > var0) { // L: 3815
				class129.cameraPitch = var0; // L: 3816
			}
		} else if (class129.cameraPitch > var0) { // L: 3819
			class129.cameraPitch -= (class129.cameraPitch - var0) * WorldMapElement.field1963 / 1000 + class33.field188; // L: 3820
			if (class129.cameraPitch < var0) { // L: 3821
				class129.cameraPitch = var0; // L: 3822
			}
		}

		var1 &= 2047; // L: 3825
		int var2 = var1 - UserComparator10.cameraYaw; // L: 3826
		if (var2 > 1024) { // L: 3827
			var2 -= 2048; // L: 3828
		} else if (var2 < -1024) { // L: 3830
			var2 += 2048; // L: 3831
		}

		if (var2 > 0) { // L: 3833
			UserComparator10.cameraYaw = UserComparator10.cameraYaw + class33.field188 + var2 * WorldMapElement.field1963 / 1000; // L: 3834
			UserComparator10.cameraYaw &= 2047; // L: 3835
		} else if (var2 < 0) { // L: 3837
			UserComparator10.cameraYaw -= -var2 * WorldMapElement.field1963 / 1000 + class33.field188; // L: 3838
			UserComparator10.cameraYaw &= 2047; // L: 3839
		}

		int var3 = var1 - UserComparator10.cameraYaw; // L: 3841
		if (var3 > 1024) { // L: 3842
			var3 -= 2048; // L: 3843
		} else if (var3 < -1024) { // L: 3845
			var3 += 2048; // L: 3846
		}

		if (var3 < 0 && var2 > 0 || var3 > 0 && var2 < 0) { // L: 3848
			UserComparator10.cameraYaw = var1; // L: 3849
		}

	} // L: 3851
}
