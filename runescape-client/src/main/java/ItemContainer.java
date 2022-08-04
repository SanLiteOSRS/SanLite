import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("bi")
@Implements("ItemContainer")
public class ItemContainer extends Node {
	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "Lpf;"
	)
	@Export("itemContainers")
	static NodeHashTable itemContainers;
	@ObfuscatedName("q")
	@Export("ids")
	int[] ids;
	@ObfuscatedName("f")
	@Export("quantities")
	int[] quantities;

	static {
		itemContainers = new NodeHashTable(32); // L: 7
	}

	ItemContainer() {
		this.ids = new int[]{-1}; // L: 8
		this.quantities = new int[]{0}; // L: 9
	} // L: 11

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(IIB)I",
		garbageValue = "79"
	)
	static final int method2154(int var0, int var1) {
		int var2 = GameEngine.method563(var0 - 1, var1 - 1) + GameEngine.method563(var0 + 1, var1 - 1) + GameEngine.method563(var0 - 1, var1 + 1) + GameEngine.method563(var0 + 1, var1 + 1); // L: 950
		int var3 = GameEngine.method563(var0 - 1, var1) + GameEngine.method563(1 + var0, var1) + GameEngine.method563(var0, var1 - 1) + GameEngine.method563(var0, 1 + var1); // L: 951
		int var4 = GameEngine.method563(var0, var1); // L: 952
		return var2 / 16 + var3 / 8 + var4 / 4; // L: 953
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(ILbc;ZI)I",
		garbageValue = "1156827407"
	)
	static int method2144(int var0, Script var1, boolean var2) {
		if (var0 == ScriptOpcodes.FRIEND_COUNT) { // L: 2351
			if (MusicPatchPcmStream.friendSystem.field801 == 0) { // L: 2352
				Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = -2;
			} else if (MusicPatchPcmStream.friendSystem.field801 == 1) { // L: 2353
				Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = -1;
			} else {
				Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = MusicPatchPcmStream.friendSystem.friendsList.getSize(); // L: 2354
			}

			return 1; // L: 2355
		} else {
			int var3;
			if (var0 == ScriptOpcodes.FRIEND_GETNAME) {
				var3 = Interpreter.Interpreter_intStack[--TaskHandler.Interpreter_intStackSize]; // L: 2358
				if (MusicPatchPcmStream.friendSystem.method1694() && var3 >= 0 && var3 < MusicPatchPcmStream.friendSystem.friendsList.getSize()) { // L: 2359
					Friend var8 = (Friend)MusicPatchPcmStream.friendSystem.friendsList.get(var3); // L: 2360
					Interpreter.Interpreter_stringStack[++GrandExchangeOfferAgeComparator.Interpreter_stringStackSize - 1] = var8.getName(); // L: 2361
					Interpreter.Interpreter_stringStack[++GrandExchangeOfferAgeComparator.Interpreter_stringStackSize - 1] = var8.getPreviousName(); // L: 2362
				} else {
					Interpreter.Interpreter_stringStack[++GrandExchangeOfferAgeComparator.Interpreter_stringStackSize - 1] = ""; // L: 2365
					Interpreter.Interpreter_stringStack[++GrandExchangeOfferAgeComparator.Interpreter_stringStackSize - 1] = ""; // L: 2366
				}

				return 1; // L: 2368
			} else if (var0 == ScriptOpcodes.FRIEND_GETWORLD) {
				var3 = Interpreter.Interpreter_intStack[--TaskHandler.Interpreter_intStackSize]; // L: 2371
				if (MusicPatchPcmStream.friendSystem.method1694() && var3 >= 0 && var3 < MusicPatchPcmStream.friendSystem.friendsList.getSize()) { // L: 2372
					Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = ((Buddy)MusicPatchPcmStream.friendSystem.friendsList.get(var3)).world; // L: 2373
				} else {
					Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = 0; // L: 2375
				}

				return 1; // L: 2376
			} else if (var0 == ScriptOpcodes.FRIEND_GETRANK) {
				var3 = Interpreter.Interpreter_intStack[--TaskHandler.Interpreter_intStackSize]; // L: 2379
				if (MusicPatchPcmStream.friendSystem.method1694() && var3 >= 0 && var3 < MusicPatchPcmStream.friendSystem.friendsList.getSize()) { // L: 2380
					Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = ((Buddy)MusicPatchPcmStream.friendSystem.friendsList.get(var3)).rank; // L: 2381
				} else {
					Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = 0; // L: 2383
				}

				return 1; // L: 2384
			} else {
				String var5;
				if (var0 == ScriptOpcodes.FRIEND_SETRANK) {
					var5 = Interpreter.Interpreter_stringStack[--GrandExchangeOfferAgeComparator.Interpreter_stringStackSize]; // L: 2387
					int var6 = Interpreter.Interpreter_intStack[--TaskHandler.Interpreter_intStackSize]; // L: 2388
					FriendSystem.method1748(var5, var6); // L: 2389
					return 1; // L: 2390
				} else if (var0 == ScriptOpcodes.FRIEND_ADD) {
					var5 = Interpreter.Interpreter_stringStack[--GrandExchangeOfferAgeComparator.Interpreter_stringStackSize]; // L: 2393
					MusicPatchPcmStream.friendSystem.addFriend(var5); // L: 2394
					return 1; // L: 2395
				} else if (var0 == ScriptOpcodes.FRIEND_DEL) {
					var5 = Interpreter.Interpreter_stringStack[--GrandExchangeOfferAgeComparator.Interpreter_stringStackSize]; // L: 2398
					MusicPatchPcmStream.friendSystem.removeFriend(var5); // L: 2399
					return 1; // L: 2400
				} else if (var0 == ScriptOpcodes.IGNORE_ADD) {
					var5 = Interpreter.Interpreter_stringStack[--GrandExchangeOfferAgeComparator.Interpreter_stringStackSize]; // L: 2403
					MusicPatchPcmStream.friendSystem.addIgnore(var5); // L: 2404
					return 1; // L: 2405
				} else if (var0 == ScriptOpcodes.IGNORE_DEL) {
					var5 = Interpreter.Interpreter_stringStack[--GrandExchangeOfferAgeComparator.Interpreter_stringStackSize]; // L: 2408
					MusicPatchPcmStream.friendSystem.removeIgnore(var5); // L: 2409
					return 1; // L: 2410
				} else if (var0 == ScriptOpcodes.FRIEND_TEST) {
					var5 = Interpreter.Interpreter_stringStack[--GrandExchangeOfferAgeComparator.Interpreter_stringStackSize]; // L: 2413
					var5 = class20.method293(var5); // L: 2414
					Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = MusicPatchPcmStream.friendSystem.isFriended(new Username(var5, class162.loginType), false) ? 1 : 0; // L: 2415
					return 1; // L: 2416
				} else if (var0 == ScriptOpcodes.CLAN_GETCHATDISPLAYNAME) {
					if (class13.friendsChatManager != null) { // L: 2419
						Interpreter.Interpreter_stringStack[++GrandExchangeOfferAgeComparator.Interpreter_stringStackSize - 1] = class13.friendsChatManager.name; // L: 2420
					} else {
						Interpreter.Interpreter_stringStack[++GrandExchangeOfferAgeComparator.Interpreter_stringStackSize - 1] = ""; // L: 2422
					}

					return 1; // L: 2423
				} else if (var0 == ScriptOpcodes.CLAN_GETCHATCOUNT) {
					if (class13.friendsChatManager != null) { // L: 2426
						Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = class13.friendsChatManager.getSize(); // L: 2427
					} else {
						Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = 0; // L: 2429
					}

					return 1; // L: 2430
				} else if (var0 == ScriptOpcodes.CLAN_GETCHATUSERNAME) {
					var3 = Interpreter.Interpreter_intStack[--TaskHandler.Interpreter_intStackSize]; // L: 2433
					if (class13.friendsChatManager != null && var3 < class13.friendsChatManager.getSize()) { // L: 2434
						Interpreter.Interpreter_stringStack[++GrandExchangeOfferAgeComparator.Interpreter_stringStackSize - 1] = class13.friendsChatManager.get(var3).getUsername().getName(); // L: 2435
					} else {
						Interpreter.Interpreter_stringStack[++GrandExchangeOfferAgeComparator.Interpreter_stringStackSize - 1] = ""; // L: 2437
					}

					return 1; // L: 2438
				} else if (var0 == ScriptOpcodes.CLAN_GETCHATUSERWORLD) {
					var3 = Interpreter.Interpreter_intStack[--TaskHandler.Interpreter_intStackSize]; // L: 2441
					if (class13.friendsChatManager != null && var3 < class13.friendsChatManager.getSize()) { // L: 2442
						Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = ((Buddy)class13.friendsChatManager.get(var3)).getWorld(); // L: 2443
					} else {
						Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = 0; // L: 2445
					}

					return 1; // L: 2446
				} else if (var0 == ScriptOpcodes.CLAN_GETCHATUSERRANK) {
					var3 = Interpreter.Interpreter_intStack[--TaskHandler.Interpreter_intStackSize]; // L: 2449
					if (class13.friendsChatManager != null && var3 < class13.friendsChatManager.getSize()) { // L: 2450
						Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = ((Buddy)class13.friendsChatManager.get(var3)).rank; // L: 2451
					} else {
						Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = 0; // L: 2453
					}

					return 1; // L: 2454
				} else if (var0 == ScriptOpcodes.CLAN_GETCHATMINKICK) {
					Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = class13.friendsChatManager != null ? class13.friendsChatManager.minKick : 0; // L: 2457
					return 1; // L: 2458
				} else if (var0 == ScriptOpcodes.CLAN_KICKUSER) {
					var5 = Interpreter.Interpreter_stringStack[--GrandExchangeOfferAgeComparator.Interpreter_stringStackSize]; // L: 2461
					class240.clanKickUser(var5); // L: 2462
					return 1; // L: 2463
				} else if (var0 == ScriptOpcodes.CLAN_GETCHATRANK) {
					Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = class13.friendsChatManager != null ? class13.friendsChatManager.rank : 0; // L: 2466
					return 1; // L: 2467
				} else if (var0 == ScriptOpcodes.CLAN_JOINCHAT) {
					var5 = Interpreter.Interpreter_stringStack[--GrandExchangeOfferAgeComparator.Interpreter_stringStackSize]; // L: 2470
					UserComparator2.Clan_joinChat(var5); // L: 2471
					return 1; // L: 2472
				} else if (var0 == ScriptOpcodes.CLAN_LEAVECHAT) {
					MouseHandler.Clan_leaveChat(); // L: 2475
					return 1; // L: 2476
				} else if (var0 == ScriptOpcodes.IGNORE_COUNT) {
					if (!MusicPatchPcmStream.friendSystem.method1694()) { // L: 2479
						Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = -1;
					} else {
						Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = MusicPatchPcmStream.friendSystem.ignoreList.getSize(); // L: 2480
					}

					return 1; // L: 2481
				} else if (var0 == ScriptOpcodes.IGNORE_GETNAME) {
					var3 = Interpreter.Interpreter_intStack[--TaskHandler.Interpreter_intStackSize]; // L: 2484
					if (MusicPatchPcmStream.friendSystem.method1694() && var3 >= 0 && var3 < MusicPatchPcmStream.friendSystem.ignoreList.getSize()) { // L: 2485
						Ignored var4 = (Ignored)MusicPatchPcmStream.friendSystem.ignoreList.get(var3); // L: 2486
						Interpreter.Interpreter_stringStack[++GrandExchangeOfferAgeComparator.Interpreter_stringStackSize - 1] = var4.getName(); // L: 2487
						Interpreter.Interpreter_stringStack[++GrandExchangeOfferAgeComparator.Interpreter_stringStackSize - 1] = var4.getPreviousName(); // L: 2488
					} else {
						Interpreter.Interpreter_stringStack[++GrandExchangeOfferAgeComparator.Interpreter_stringStackSize - 1] = ""; // L: 2491
						Interpreter.Interpreter_stringStack[++GrandExchangeOfferAgeComparator.Interpreter_stringStackSize - 1] = ""; // L: 2492
					}

					return 1; // L: 2494
				} else if (var0 == ScriptOpcodes.IGNORE_TEST) {
					var5 = Interpreter.Interpreter_stringStack[--GrandExchangeOfferAgeComparator.Interpreter_stringStackSize]; // L: 2497
					var5 = class20.method293(var5); // L: 2498
					Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = MusicPatchPcmStream.friendSystem.isIgnored(new Username(var5, class162.loginType)) ? 1 : 0; // L: 2499
					return 1; // L: 2500
				} else if (var0 == ScriptOpcodes.CLAN_ISSELF) {
					var3 = Interpreter.Interpreter_intStack[--TaskHandler.Interpreter_intStackSize]; // L: 2503
					if (class13.friendsChatManager != null && var3 < class13.friendsChatManager.getSize() && class13.friendsChatManager.get(var3).getUsername().equals(class28.localPlayer.username)) { // L: 2504
						Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = 1; // L: 2505
					} else {
						Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = 0; // L: 2507
					}

					return 1; // L: 2508
				} else if (var0 == ScriptOpcodes.CLAN_GETCHATOWNERNAME) {
					if (class13.friendsChatManager != null && class13.friendsChatManager.owner != null) { // L: 2511
						Interpreter.Interpreter_stringStack[++GrandExchangeOfferAgeComparator.Interpreter_stringStackSize - 1] = class13.friendsChatManager.owner; // L: 2512
					} else {
						Interpreter.Interpreter_stringStack[++GrandExchangeOfferAgeComparator.Interpreter_stringStackSize - 1] = ""; // L: 2514
					}

					return 1; // L: 2515
				} else if (var0 == ScriptOpcodes.CLAN_ISFRIEND) {
					var3 = Interpreter.Interpreter_intStack[--TaskHandler.Interpreter_intStackSize]; // L: 2518
					if (class13.friendsChatManager != null && var3 < class13.friendsChatManager.getSize() && ((FriendsChatMember)class13.friendsChatManager.get(var3)).isFriend()) { // L: 2519
						Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = 1; // L: 2520
					} else {
						Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = 0; // L: 2522
					}

					return 1; // L: 2523
				} else if (var0 != ScriptOpcodes.CLAN_ISIGNORE) {
					if (var0 == 3628) {
						MusicPatchPcmStream.friendSystem.friendsList.removeComparator(); // L: 2534
						return 1; // L: 2535
					} else {
						boolean var7;
						if (var0 == 3629) {
							var7 = Interpreter.Interpreter_intStack[--TaskHandler.Interpreter_intStackSize] == 1; // L: 2538
							MusicPatchPcmStream.friendSystem.friendsList.addComparator(new UserComparator1(var7)); // L: 2539
							return 1; // L: 2540
						} else if (var0 == 3630) {
							var7 = Interpreter.Interpreter_intStack[--TaskHandler.Interpreter_intStackSize] == 1; // L: 2543
							MusicPatchPcmStream.friendSystem.friendsList.addComparator(new UserComparator2(var7)); // L: 2544
							return 1; // L: 2545
						} else if (var0 == 3631) {
							var7 = Interpreter.Interpreter_intStack[--TaskHandler.Interpreter_intStackSize] == 1; // L: 2548
							MusicPatchPcmStream.friendSystem.friendsList.addComparator(new UserComparator3(var7)); // L: 2549
							return 1; // L: 2550
						} else if (var0 == 3632) {
							var7 = Interpreter.Interpreter_intStack[--TaskHandler.Interpreter_intStackSize] == 1; // L: 2553
							MusicPatchPcmStream.friendSystem.friendsList.addComparator(new UserComparator4(var7)); // L: 2554
							return 1; // L: 2555
						} else if (var0 == 3633) {
							var7 = Interpreter.Interpreter_intStack[--TaskHandler.Interpreter_intStackSize] == 1; // L: 2558
							MusicPatchPcmStream.friendSystem.friendsList.addComparator(new UserComparator5(var7)); // L: 2559
							return 1; // L: 2560
						} else if (var0 == 3634) {
							var7 = Interpreter.Interpreter_intStack[--TaskHandler.Interpreter_intStackSize] == 1; // L: 2563
							MusicPatchPcmStream.friendSystem.friendsList.addComparator(new UserComparator6(var7)); // L: 2564
							return 1; // L: 2565
						} else if (var0 == 3635) {
							var7 = Interpreter.Interpreter_intStack[--TaskHandler.Interpreter_intStackSize] == 1; // L: 2568
							MusicPatchPcmStream.friendSystem.friendsList.addComparator(new UserComparator7(var7)); // L: 2569
							return 1; // L: 2570
						} else if (var0 == 3636) {
							var7 = Interpreter.Interpreter_intStack[--TaskHandler.Interpreter_intStackSize] == 1; // L: 2573
							MusicPatchPcmStream.friendSystem.friendsList.addComparator(new UserComparator8(var7)); // L: 2574
							return 1; // L: 2575
						} else if (var0 == 3637) {
							var7 = Interpreter.Interpreter_intStack[--TaskHandler.Interpreter_intStackSize] == 1; // L: 2578
							MusicPatchPcmStream.friendSystem.friendsList.addComparator(new UserComparator9(var7)); // L: 2579
							return 1; // L: 2580
						} else if (var0 == 3638) {
							var7 = Interpreter.Interpreter_intStack[--TaskHandler.Interpreter_intStackSize] == 1; // L: 2583
							MusicPatchPcmStream.friendSystem.friendsList.addComparator(new UserComparator10(var7)); // L: 2584
							return 1; // L: 2585
						} else if (var0 == 3639) {
							MusicPatchPcmStream.friendSystem.friendsList.sort(); // L: 2588
							return 1; // L: 2589
						} else if (var0 == 3640) {
							MusicPatchPcmStream.friendSystem.ignoreList.removeComparator(); // L: 2592
							return 1; // L: 2593
						} else if (var0 == 3641) {
							var7 = Interpreter.Interpreter_intStack[--TaskHandler.Interpreter_intStackSize] == 1; // L: 2596
							MusicPatchPcmStream.friendSystem.ignoreList.addComparator(new UserComparator1(var7)); // L: 2597
							return 1; // L: 2598
						} else if (var0 == 3642) {
							var7 = Interpreter.Interpreter_intStack[--TaskHandler.Interpreter_intStackSize] == 1; // L: 2601
							MusicPatchPcmStream.friendSystem.ignoreList.addComparator(new UserComparator2(var7)); // L: 2602
							return 1; // L: 2603
						} else if (var0 == 3643) {
							MusicPatchPcmStream.friendSystem.ignoreList.sort(); // L: 2606
							return 1; // L: 2607
						} else if (var0 == 3644) {
							if (class13.friendsChatManager != null) { // L: 2610
								class13.friendsChatManager.removeComparator(); // L: 2611
							}

							return 1; // L: 2613
						} else if (var0 == 3645) {
							var7 = Interpreter.Interpreter_intStack[--TaskHandler.Interpreter_intStackSize] == 1; // L: 2616
							if (class13.friendsChatManager != null) { // L: 2617
								class13.friendsChatManager.addComparator(new UserComparator1(var7)); // L: 2618
							}

							return 1; // L: 2620
						} else if (var0 == 3646) {
							var7 = Interpreter.Interpreter_intStack[--TaskHandler.Interpreter_intStackSize] == 1; // L: 2623
							if (class13.friendsChatManager != null) { // L: 2624
								class13.friendsChatManager.addComparator(new UserComparator2(var7)); // L: 2625
							}

							return 1; // L: 2627
						} else if (var0 == 3647) {
							var7 = Interpreter.Interpreter_intStack[--TaskHandler.Interpreter_intStackSize] == 1; // L: 2630
							if (class13.friendsChatManager != null) { // L: 2631
								class13.friendsChatManager.addComparator(new UserComparator3(var7)); // L: 2632
							}

							return 1; // L: 2634
						} else if (var0 == 3648) {
							var7 = Interpreter.Interpreter_intStack[--TaskHandler.Interpreter_intStackSize] == 1; // L: 2637
							if (class13.friendsChatManager != null) { // L: 2638
								class13.friendsChatManager.addComparator(new UserComparator4(var7)); // L: 2639
							}

							return 1; // L: 2641
						} else if (var0 == 3649) {
							var7 = Interpreter.Interpreter_intStack[--TaskHandler.Interpreter_intStackSize] == 1; // L: 2644
							if (class13.friendsChatManager != null) { // L: 2645
								class13.friendsChatManager.addComparator(new UserComparator5(var7)); // L: 2646
							}

							return 1; // L: 2648
						} else if (var0 == 3650) {
							var7 = Interpreter.Interpreter_intStack[--TaskHandler.Interpreter_intStackSize] == 1; // L: 2651
							if (class13.friendsChatManager != null) { // L: 2652
								class13.friendsChatManager.addComparator(new UserComparator6(var7)); // L: 2653
							}

							return 1; // L: 2655
						} else if (var0 == 3651) {
							var7 = Interpreter.Interpreter_intStack[--TaskHandler.Interpreter_intStackSize] == 1; // L: 2658
							if (class13.friendsChatManager != null) { // L: 2659
								class13.friendsChatManager.addComparator(new UserComparator7(var7)); // L: 2660
							}

							return 1; // L: 2662
						} else if (var0 == 3652) {
							var7 = Interpreter.Interpreter_intStack[--TaskHandler.Interpreter_intStackSize] == 1; // L: 2665
							if (class13.friendsChatManager != null) { // L: 2666
								class13.friendsChatManager.addComparator(new UserComparator8(var7)); // L: 2667
							}

							return 1; // L: 2669
						} else if (var0 == 3653) {
							var7 = Interpreter.Interpreter_intStack[--TaskHandler.Interpreter_intStackSize] == 1; // L: 2672
							if (class13.friendsChatManager != null) { // L: 2673
								class13.friendsChatManager.addComparator(new UserComparator9(var7)); // L: 2674
							}

							return 1; // L: 2676
						} else if (var0 == 3654) {
							var7 = Interpreter.Interpreter_intStack[--TaskHandler.Interpreter_intStackSize] == 1; // L: 2679
							if (class13.friendsChatManager != null) { // L: 2680
								class13.friendsChatManager.addComparator(new UserComparator10(var7)); // L: 2681
							}

							return 1; // L: 2683
						} else if (var0 == 3655) {
							if (class13.friendsChatManager != null) { // L: 2686
								class13.friendsChatManager.sort(); // L: 2687
							}

							return 1; // L: 2689
						} else if (var0 == 3656) {
							var7 = Interpreter.Interpreter_intStack[--TaskHandler.Interpreter_intStackSize] == 1; // L: 2692
							MusicPatchPcmStream.friendSystem.friendsList.addComparator(new BuddyRankComparator(var7)); // L: 2693
							return 1; // L: 2694
						} else if (var0 == 3657) {
							var7 = Interpreter.Interpreter_intStack[--TaskHandler.Interpreter_intStackSize] == 1; // L: 2697
							if (class13.friendsChatManager != null) { // L: 2698
								class13.friendsChatManager.addComparator(new BuddyRankComparator(var7)); // L: 2699
							}

							return 1; // L: 2701
						} else {
							return 2; // L: 2703
						}
					}
				} else {
					var3 = Interpreter.Interpreter_intStack[--TaskHandler.Interpreter_intStackSize]; // L: 2526
					if (class13.friendsChatManager != null && var3 < class13.friendsChatManager.getSize() && ((FriendsChatMember)class13.friendsChatManager.get(var3)).isIgnored()) { // L: 2527
						Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = 1; // L: 2528
					} else {
						Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = 0; // L: 2530
					}

					return 1; // L: 2531
				}
			}
		}
	}
}
