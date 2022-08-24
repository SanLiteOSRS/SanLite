import java.math.BigInteger;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("bh")
public class class67 {
	@ObfuscatedName("s")
	static final BigInteger field865;
	@ObfuscatedName("h")
	static final BigInteger field863;
	@ObfuscatedName("nx")
	@ObfuscatedGetter(
		intValue = 1422794341
	)
	@Export("selectedItemSlot")
	static int selectedItemSlot;

	static {
		field865 = new BigInteger("10001", 16); // L: 6
		field863 = new BigInteger("824f2de2a0dd6d85b44b801f7518e6cef7eacec0a14284cbab75c2ac2cf34d2c942efb3604fea616fbf370136562a38ede7136a51e37889c49ab1883910b0296731625bb64164f6f0caf48dc72e22612513ad3576daae73c5c9a1b27d7cbffd7ad60f1de62d8526ce9d17a33ec709e3d620b704d37806701c88b1ddd5057dd5f", 16); // L: 7
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(I)[Ljq;",
		garbageValue = "92901003"
	)
	public static class263[] method1861() {
		return new class263[]{class263.field3032, class263.field3029, class263.field3028, class263.field3027, class263.field3030, class263.field3031, class263.field3026, class263.field3033, class263.field3034, class263.field3036}; // L: 17
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(ILbz;ZI)I",
		garbageValue = "-1729072365"
	)
	static int method1862(int var0, Script var1, boolean var2) {
		if (var0 == ScriptOpcodes.FRIEND_COUNT) { // L: 2360
			if (class321.friendSystem.field794 == 0) { // L: 2361
				Interpreter.Interpreter_intStack[++Nameable.Interpreter_intStackSize - 1] = -2;
			} else if (class321.friendSystem.field794 == 1) { // L: 2362
				Interpreter.Interpreter_intStack[++Nameable.Interpreter_intStackSize - 1] = -1;
			} else {
				Interpreter.Interpreter_intStack[++Nameable.Interpreter_intStackSize - 1] = class321.friendSystem.friendsList.getSize(); // L: 2363
			}

			return 1; // L: 2364
		} else {
			int var3;
			if (var0 == ScriptOpcodes.FRIEND_GETNAME) {
				var3 = Interpreter.Interpreter_intStack[--Nameable.Interpreter_intStackSize]; // L: 2367
				if (class321.friendSystem.method1627() && var3 >= 0 && var3 < class321.friendSystem.friendsList.getSize()) { // L: 2368
					Friend var8 = (Friend)class321.friendSystem.friendsList.get(var3); // L: 2369
					Interpreter.Interpreter_stringStack[++UserComparator8.Interpreter_stringStackSize - 1] = var8.getName(); // L: 2370
					Interpreter.Interpreter_stringStack[++UserComparator8.Interpreter_stringStackSize - 1] = var8.getPreviousName(); // L: 2371
				} else {
					Interpreter.Interpreter_stringStack[++UserComparator8.Interpreter_stringStackSize - 1] = ""; // L: 2374
					Interpreter.Interpreter_stringStack[++UserComparator8.Interpreter_stringStackSize - 1] = ""; // L: 2375
				}

				return 1; // L: 2377
			} else if (var0 == ScriptOpcodes.FRIEND_GETWORLD) {
				var3 = Interpreter.Interpreter_intStack[--Nameable.Interpreter_intStackSize]; // L: 2380
				if (class321.friendSystem.method1627() && var3 >= 0 && var3 < class321.friendSystem.friendsList.getSize()) { // L: 2381
					Interpreter.Interpreter_intStack[++Nameable.Interpreter_intStackSize - 1] = ((Buddy)class321.friendSystem.friendsList.get(var3)).world; // L: 2382
				} else {
					Interpreter.Interpreter_intStack[++Nameable.Interpreter_intStackSize - 1] = 0; // L: 2384
				}

				return 1; // L: 2385
			} else if (var0 == ScriptOpcodes.FRIEND_GETRANK) {
				var3 = Interpreter.Interpreter_intStack[--Nameable.Interpreter_intStackSize]; // L: 2388
				if (class321.friendSystem.method1627() && var3 >= 0 && var3 < class321.friendSystem.friendsList.getSize()) { // L: 2389
					Interpreter.Interpreter_intStack[++Nameable.Interpreter_intStackSize - 1] = ((Buddy)class321.friendSystem.friendsList.get(var3)).rank; // L: 2390
				} else {
					Interpreter.Interpreter_intStack[++Nameable.Interpreter_intStackSize - 1] = 0; // L: 2392
				}

				return 1; // L: 2393
			} else {
				String var5;
				if (var0 == ScriptOpcodes.FRIEND_SETRANK) {
					var5 = Interpreter.Interpreter_stringStack[--UserComparator8.Interpreter_stringStackSize]; // L: 2396
					int var6 = Interpreter.Interpreter_intStack[--Nameable.Interpreter_intStackSize]; // L: 2397
					JagexCache.method3205(var5, var6); // L: 2398
					return 1; // L: 2399
				} else if (var0 == ScriptOpcodes.FRIEND_ADD) {
					var5 = Interpreter.Interpreter_stringStack[--UserComparator8.Interpreter_stringStackSize]; // L: 2402
					class321.friendSystem.addFriend(var5); // L: 2403
					return 1; // L: 2404
				} else if (var0 == ScriptOpcodes.FRIEND_DEL) {
					var5 = Interpreter.Interpreter_stringStack[--UserComparator8.Interpreter_stringStackSize]; // L: 2407
					class321.friendSystem.removeFriend(var5); // L: 2408
					return 1; // L: 2409
				} else if (var0 == ScriptOpcodes.IGNORE_ADD) {
					var5 = Interpreter.Interpreter_stringStack[--UserComparator8.Interpreter_stringStackSize]; // L: 2412
					class321.friendSystem.addIgnore(var5); // L: 2413
					return 1; // L: 2414
				} else if (var0 == ScriptOpcodes.IGNORE_DEL) {
					var5 = Interpreter.Interpreter_stringStack[--UserComparator8.Interpreter_stringStackSize]; // L: 2417
					class321.friendSystem.removeIgnore(var5); // L: 2418
					return 1; // L: 2419
				} else if (var0 == ScriptOpcodes.FRIEND_TEST) {
					var5 = Interpreter.Interpreter_stringStack[--UserComparator8.Interpreter_stringStackSize]; // L: 2422
					var5 = WorldMapSection0.method4870(var5); // L: 2423
					Interpreter.Interpreter_intStack[++Nameable.Interpreter_intStackSize - 1] = class321.friendSystem.isFriended(new Username(var5, StructComposition.loginType), false) ? 1 : 0; // L: 2424
					return 1; // L: 2425
				} else if (var0 == ScriptOpcodes.CLAN_GETCHATDISPLAYNAME) {
					if (class19.friendsChatManager != null) { // L: 2428
						Interpreter.Interpreter_stringStack[++UserComparator8.Interpreter_stringStackSize - 1] = class19.friendsChatManager.name; // L: 2429
					} else {
						Interpreter.Interpreter_stringStack[++UserComparator8.Interpreter_stringStackSize - 1] = ""; // L: 2431
					}

					return 1; // L: 2432
				} else if (var0 == ScriptOpcodes.CLAN_GETCHATCOUNT) {
					if (class19.friendsChatManager != null) { // L: 2435
						Interpreter.Interpreter_intStack[++Nameable.Interpreter_intStackSize - 1] = class19.friendsChatManager.getSize(); // L: 2436
					} else {
						Interpreter.Interpreter_intStack[++Nameable.Interpreter_intStackSize - 1] = 0; // L: 2438
					}

					return 1; // L: 2439
				} else if (var0 == ScriptOpcodes.CLAN_GETCHATUSERNAME) {
					var3 = Interpreter.Interpreter_intStack[--Nameable.Interpreter_intStackSize]; // L: 2442
					if (class19.friendsChatManager != null && var3 < class19.friendsChatManager.getSize()) { // L: 2443
						Interpreter.Interpreter_stringStack[++UserComparator8.Interpreter_stringStackSize - 1] = class19.friendsChatManager.get(var3).getUsername().getName(); // L: 2444
					} else {
						Interpreter.Interpreter_stringStack[++UserComparator8.Interpreter_stringStackSize - 1] = ""; // L: 2446
					}

					return 1; // L: 2447
				} else if (var0 == ScriptOpcodes.CLAN_GETCHATUSERWORLD) {
					var3 = Interpreter.Interpreter_intStack[--Nameable.Interpreter_intStackSize]; // L: 2450
					if (class19.friendsChatManager != null && var3 < class19.friendsChatManager.getSize()) { // L: 2451
						Interpreter.Interpreter_intStack[++Nameable.Interpreter_intStackSize - 1] = ((Buddy)class19.friendsChatManager.get(var3)).getWorld(); // L: 2452
					} else {
						Interpreter.Interpreter_intStack[++Nameable.Interpreter_intStackSize - 1] = 0; // L: 2454
					}

					return 1; // L: 2455
				} else if (var0 == ScriptOpcodes.CLAN_GETCHATUSERRANK) {
					var3 = Interpreter.Interpreter_intStack[--Nameable.Interpreter_intStackSize]; // L: 2458
					if (class19.friendsChatManager != null && var3 < class19.friendsChatManager.getSize()) { // L: 2459
						Interpreter.Interpreter_intStack[++Nameable.Interpreter_intStackSize - 1] = ((Buddy)class19.friendsChatManager.get(var3)).rank; // L: 2460
					} else {
						Interpreter.Interpreter_intStack[++Nameable.Interpreter_intStackSize - 1] = 0; // L: 2462
					}

					return 1; // L: 2463
				} else if (var0 == ScriptOpcodes.CLAN_GETCHATMINKICK) {
					Interpreter.Interpreter_intStack[++Nameable.Interpreter_intStackSize - 1] = class19.friendsChatManager != null ? class19.friendsChatManager.minKick : 0; // L: 2466
					return 1; // L: 2467
				} else if (var0 == ScriptOpcodes.CLAN_KICKUSER) {
					var5 = Interpreter.Interpreter_stringStack[--UserComparator8.Interpreter_stringStackSize]; // L: 2470
					DynamicObject.clanKickUser(var5); // L: 2471
					return 1; // L: 2472
				} else if (var0 == ScriptOpcodes.CLAN_GETCHATRANK) {
					Interpreter.Interpreter_intStack[++Nameable.Interpreter_intStackSize - 1] = class19.friendsChatManager != null ? class19.friendsChatManager.rank : 0; // L: 2475
					return 1; // L: 2476
				} else if (var0 == ScriptOpcodes.CLAN_JOINCHAT) {
					var5 = Interpreter.Interpreter_stringStack[--UserComparator8.Interpreter_stringStackSize]; // L: 2479
					Login.Clan_joinChat(var5); // L: 2480
					return 1; // L: 2481
				} else if (var0 == ScriptOpcodes.CLAN_LEAVECHAT) {
					class114.Clan_leaveChat(); // L: 2484
					return 1; // L: 2485
				} else if (var0 == ScriptOpcodes.IGNORE_COUNT) {
					if (!class321.friendSystem.method1627()) { // L: 2488
						Interpreter.Interpreter_intStack[++Nameable.Interpreter_intStackSize - 1] = -1;
					} else {
						Interpreter.Interpreter_intStack[++Nameable.Interpreter_intStackSize - 1] = class321.friendSystem.ignoreList.getSize(); // L: 2489
					}

					return 1; // L: 2490
				} else if (var0 == ScriptOpcodes.IGNORE_GETNAME) {
					var3 = Interpreter.Interpreter_intStack[--Nameable.Interpreter_intStackSize]; // L: 2493
					if (class321.friendSystem.method1627() && var3 >= 0 && var3 < class321.friendSystem.ignoreList.getSize()) { // L: 2494
						Ignored var4 = (Ignored)class321.friendSystem.ignoreList.get(var3); // L: 2495
						Interpreter.Interpreter_stringStack[++UserComparator8.Interpreter_stringStackSize - 1] = var4.getName(); // L: 2496
						Interpreter.Interpreter_stringStack[++UserComparator8.Interpreter_stringStackSize - 1] = var4.getPreviousName(); // L: 2497
					} else {
						Interpreter.Interpreter_stringStack[++UserComparator8.Interpreter_stringStackSize - 1] = ""; // L: 2500
						Interpreter.Interpreter_stringStack[++UserComparator8.Interpreter_stringStackSize - 1] = ""; // L: 2501
					}

					return 1; // L: 2503
				} else if (var0 == ScriptOpcodes.IGNORE_TEST) {
					var5 = Interpreter.Interpreter_stringStack[--UserComparator8.Interpreter_stringStackSize]; // L: 2506
					var5 = WorldMapSection0.method4870(var5); // L: 2507
					Interpreter.Interpreter_intStack[++Nameable.Interpreter_intStackSize - 1] = class321.friendSystem.isIgnored(new Username(var5, StructComposition.loginType)) ? 1 : 0; // L: 2508
					return 1; // L: 2509
				} else if (var0 == ScriptOpcodes.CLAN_ISSELF) {
					var3 = Interpreter.Interpreter_intStack[--Nameable.Interpreter_intStackSize]; // L: 2512
					if (class19.friendsChatManager != null && var3 < class19.friendsChatManager.getSize() && class19.friendsChatManager.get(var3).getUsername().equals(ScriptFrame.localPlayer.username)) { // L: 2513
						Interpreter.Interpreter_intStack[++Nameable.Interpreter_intStackSize - 1] = 1; // L: 2514
					} else {
						Interpreter.Interpreter_intStack[++Nameable.Interpreter_intStackSize - 1] = 0; // L: 2516
					}

					return 1; // L: 2517
				} else if (var0 == ScriptOpcodes.CLAN_GETCHATOWNERNAME) {
					if (class19.friendsChatManager != null && class19.friendsChatManager.owner != null) { // L: 2520
						Interpreter.Interpreter_stringStack[++UserComparator8.Interpreter_stringStackSize - 1] = class19.friendsChatManager.owner; // L: 2521
					} else {
						Interpreter.Interpreter_stringStack[++UserComparator8.Interpreter_stringStackSize - 1] = ""; // L: 2523
					}

					return 1; // L: 2524
				} else if (var0 == ScriptOpcodes.CLAN_ISFRIEND) {
					var3 = Interpreter.Interpreter_intStack[--Nameable.Interpreter_intStackSize]; // L: 2527
					if (class19.friendsChatManager != null && var3 < class19.friendsChatManager.getSize() && ((FriendsChatMember)class19.friendsChatManager.get(var3)).isFriend()) { // L: 2528
						Interpreter.Interpreter_intStack[++Nameable.Interpreter_intStackSize - 1] = 1; // L: 2529
					} else {
						Interpreter.Interpreter_intStack[++Nameable.Interpreter_intStackSize - 1] = 0; // L: 2531
					}

					return 1; // L: 2532
				} else if (var0 != ScriptOpcodes.CLAN_ISIGNORE) {
					if (var0 == 3628) {
						class321.friendSystem.friendsList.removeComparator(); // L: 2543
						return 1; // L: 2544
					} else {
						boolean var7;
						if (var0 == 3629) {
							var7 = Interpreter.Interpreter_intStack[--Nameable.Interpreter_intStackSize] == 1; // L: 2547
							class321.friendSystem.friendsList.addComparator(new UserComparator1(var7)); // L: 2548
							return 1; // L: 2549
						} else if (var0 == 3630) {
							var7 = Interpreter.Interpreter_intStack[--Nameable.Interpreter_intStackSize] == 1; // L: 2552
							class321.friendSystem.friendsList.addComparator(new UserComparator2(var7)); // L: 2553
							return 1; // L: 2554
						} else if (var0 == 3631) {
							var7 = Interpreter.Interpreter_intStack[--Nameable.Interpreter_intStackSize] == 1; // L: 2557
							class321.friendSystem.friendsList.addComparator(new UserComparator3(var7)); // L: 2558
							return 1; // L: 2559
						} else if (var0 == 3632) {
							var7 = Interpreter.Interpreter_intStack[--Nameable.Interpreter_intStackSize] == 1; // L: 2562
							class321.friendSystem.friendsList.addComparator(new UserComparator4(var7)); // L: 2563
							return 1; // L: 2564
						} else if (var0 == 3633) {
							var7 = Interpreter.Interpreter_intStack[--Nameable.Interpreter_intStackSize] == 1; // L: 2567
							class321.friendSystem.friendsList.addComparator(new UserComparator5(var7)); // L: 2568
							return 1; // L: 2569
						} else if (var0 == 3634) {
							var7 = Interpreter.Interpreter_intStack[--Nameable.Interpreter_intStackSize] == 1; // L: 2572
							class321.friendSystem.friendsList.addComparator(new UserComparator6(var7)); // L: 2573
							return 1; // L: 2574
						} else if (var0 == 3635) {
							var7 = Interpreter.Interpreter_intStack[--Nameable.Interpreter_intStackSize] == 1; // L: 2577
							class321.friendSystem.friendsList.addComparator(new UserComparator7(var7)); // L: 2578
							return 1; // L: 2579
						} else if (var0 == 3636) {
							var7 = Interpreter.Interpreter_intStack[--Nameable.Interpreter_intStackSize] == 1; // L: 2582
							class321.friendSystem.friendsList.addComparator(new UserComparator8(var7)); // L: 2583
							return 1; // L: 2584
						} else if (var0 == 3637) {
							var7 = Interpreter.Interpreter_intStack[--Nameable.Interpreter_intStackSize] == 1; // L: 2587
							class321.friendSystem.friendsList.addComparator(new UserComparator9(var7)); // L: 2588
							return 1; // L: 2589
						} else if (var0 == 3638) {
							var7 = Interpreter.Interpreter_intStack[--Nameable.Interpreter_intStackSize] == 1; // L: 2592
							class321.friendSystem.friendsList.addComparator(new UserComparator10(var7)); // L: 2593
							return 1; // L: 2594
						} else if (var0 == 3639) {
							class321.friendSystem.friendsList.sort(); // L: 2597
							return 1; // L: 2598
						} else if (var0 == 3640) {
							class321.friendSystem.ignoreList.removeComparator(); // L: 2601
							return 1; // L: 2602
						} else if (var0 == 3641) {
							var7 = Interpreter.Interpreter_intStack[--Nameable.Interpreter_intStackSize] == 1; // L: 2605
							class321.friendSystem.ignoreList.addComparator(new UserComparator1(var7)); // L: 2606
							return 1; // L: 2607
						} else if (var0 == 3642) {
							var7 = Interpreter.Interpreter_intStack[--Nameable.Interpreter_intStackSize] == 1; // L: 2610
							class321.friendSystem.ignoreList.addComparator(new UserComparator2(var7)); // L: 2611
							return 1; // L: 2612
						} else if (var0 == 3643) {
							class321.friendSystem.ignoreList.sort(); // L: 2615
							return 1; // L: 2616
						} else if (var0 == 3644) {
							if (class19.friendsChatManager != null) { // L: 2619
								class19.friendsChatManager.removeComparator(); // L: 2620
							}

							return 1; // L: 2622
						} else if (var0 == 3645) {
							var7 = Interpreter.Interpreter_intStack[--Nameable.Interpreter_intStackSize] == 1; // L: 2625
							if (class19.friendsChatManager != null) { // L: 2626
								class19.friendsChatManager.addComparator(new UserComparator1(var7)); // L: 2627
							}

							return 1; // L: 2629
						} else if (var0 == 3646) {
							var7 = Interpreter.Interpreter_intStack[--Nameable.Interpreter_intStackSize] == 1; // L: 2632
							if (class19.friendsChatManager != null) { // L: 2633
								class19.friendsChatManager.addComparator(new UserComparator2(var7)); // L: 2634
							}

							return 1; // L: 2636
						} else if (var0 == 3647) {
							var7 = Interpreter.Interpreter_intStack[--Nameable.Interpreter_intStackSize] == 1; // L: 2639
							if (class19.friendsChatManager != null) { // L: 2640
								class19.friendsChatManager.addComparator(new UserComparator3(var7)); // L: 2641
							}

							return 1; // L: 2643
						} else if (var0 == 3648) {
							var7 = Interpreter.Interpreter_intStack[--Nameable.Interpreter_intStackSize] == 1; // L: 2646
							if (class19.friendsChatManager != null) { // L: 2647
								class19.friendsChatManager.addComparator(new UserComparator4(var7)); // L: 2648
							}

							return 1; // L: 2650
						} else if (var0 == 3649) {
							var7 = Interpreter.Interpreter_intStack[--Nameable.Interpreter_intStackSize] == 1; // L: 2653
							if (class19.friendsChatManager != null) { // L: 2654
								class19.friendsChatManager.addComparator(new UserComparator5(var7)); // L: 2655
							}

							return 1; // L: 2657
						} else if (var0 == 3650) {
							var7 = Interpreter.Interpreter_intStack[--Nameable.Interpreter_intStackSize] == 1; // L: 2660
							if (class19.friendsChatManager != null) { // L: 2661
								class19.friendsChatManager.addComparator(new UserComparator6(var7)); // L: 2662
							}

							return 1; // L: 2664
						} else if (var0 == 3651) {
							var7 = Interpreter.Interpreter_intStack[--Nameable.Interpreter_intStackSize] == 1; // L: 2667
							if (class19.friendsChatManager != null) { // L: 2668
								class19.friendsChatManager.addComparator(new UserComparator7(var7)); // L: 2669
							}

							return 1; // L: 2671
						} else if (var0 == 3652) {
							var7 = Interpreter.Interpreter_intStack[--Nameable.Interpreter_intStackSize] == 1; // L: 2674
							if (class19.friendsChatManager != null) { // L: 2675
								class19.friendsChatManager.addComparator(new UserComparator8(var7)); // L: 2676
							}

							return 1; // L: 2678
						} else if (var0 == 3653) {
							var7 = Interpreter.Interpreter_intStack[--Nameable.Interpreter_intStackSize] == 1; // L: 2681
							if (class19.friendsChatManager != null) { // L: 2682
								class19.friendsChatManager.addComparator(new UserComparator9(var7)); // L: 2683
							}

							return 1; // L: 2685
						} else if (var0 == 3654) {
							var7 = Interpreter.Interpreter_intStack[--Nameable.Interpreter_intStackSize] == 1; // L: 2688
							if (class19.friendsChatManager != null) { // L: 2689
								class19.friendsChatManager.addComparator(new UserComparator10(var7)); // L: 2690
							}

							return 1; // L: 2692
						} else if (var0 == 3655) {
							if (class19.friendsChatManager != null) { // L: 2695
								class19.friendsChatManager.sort(); // L: 2696
							}

							return 1; // L: 2698
						} else if (var0 == 3656) {
							var7 = Interpreter.Interpreter_intStack[--Nameable.Interpreter_intStackSize] == 1; // L: 2701
							class321.friendSystem.friendsList.addComparator(new BuddyRankComparator(var7)); // L: 2702
							return 1; // L: 2703
						} else if (var0 == 3657) {
							var7 = Interpreter.Interpreter_intStack[--Nameable.Interpreter_intStackSize] == 1; // L: 2706
							if (class19.friendsChatManager != null) { // L: 2707
								class19.friendsChatManager.addComparator(new BuddyRankComparator(var7)); // L: 2708
							}

							return 1; // L: 2710
						} else {
							return 2; // L: 2712
						}
					}
				} else {
					var3 = Interpreter.Interpreter_intStack[--Nameable.Interpreter_intStackSize]; // L: 2535
					if (class19.friendsChatManager != null && var3 < class19.friendsChatManager.getSize() && ((FriendsChatMember)class19.friendsChatManager.get(var3)).isIgnored()) { // L: 2536
						Interpreter.Interpreter_intStack[++Nameable.Interpreter_intStackSize - 1] = 1; // L: 2537
					} else {
						Interpreter.Interpreter_intStack[++Nameable.Interpreter_intStackSize - 1] = 0; // L: 2539
					}

					return 1; // L: 2540
				}
			}
		}
	}
}
